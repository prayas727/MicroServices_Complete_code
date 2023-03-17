package com.example.demo.ConsumerCartService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//import com.netflix.discovery.DiscoveryClient;

@Component
public class CartConsumerService {
	
	@Autowired
	private LoadBalancerClient lc;
//	@Autowired
//	private DiscoveryClient client;
//
//	public String getCartData() {
//		// TODO Auto-generated method stub
//		List<ServiceInstance> list=client.getInstances("CART-SERVICE");
//		ServiceInstance si=list.get(0);
//		System.out.println(si);
//		System.out.println(si.getUri());
//		String url=si.getUri()+"/cart/getmsg";
//		RestTemplate rt= new RestTemplate();
//		ResponseEntity<String> re=rt.getForEntity(url,String.class);
//		
//		return re.getBody();
//	}
//	->Code Load Balancer ,no need to add @LoadBalancerClient in provider and no need to remove Discovery client as we will need to register the mS
	public String getCartData() {
	// TODO Auto-generated method stub
   ServiceInstance si= lc.choose("CART-SERVICE");
	String url=si.getUri()+"/cart/getmsg";
	RestTemplate tr=new RestTemplate();
	ResponseEntity<String> res=tr.getForEntity(url, String.class);
	return res.getBody();
}

}
