package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.beans.Pojo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//
//public class FeignProvider {
//	
//	@GetMapping("/feignServices")
//	public ResponseEntity<String> getFeign() 
//	{
//		return ResponseEntity.ok("FeignProvider");
//	}
//
//}
/*---------------NO Need TO write above code --------------------*/

/*@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private CartConsumerService consumer;

	@GetMapping("/orderMsg")
	public ResponseEntity<String> getOrder()
	{
		
		String cm=consumer.getCartData();
		return ResponseEntity.ok("Hi Cart Data from Order this your data :-"+cm);
	}
	
}
*/
//interface:ReturnType,params,Path,HttpMethod
@FeignClient("ORDER-SERVICE")
public interface FeignProvider {
	@GetMapping("/order/orderMsg")
	public ResponseEntity<String> findData();
	
	@GetMapping("/order/orderMsg/{id}")
	public ResponseEntity<Pojo> getOrderwithPojo(@PathVariable Integer id);

}
