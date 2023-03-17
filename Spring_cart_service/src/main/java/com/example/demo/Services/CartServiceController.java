package com.example.demo.Services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
//@PropertySource(value={"classpath:application.properties"})
public class CartServiceController {
	@Value("${server.port}")
	private String port;
//    @Value("${alot}")
//	private String port;
 
	@GetMapping("/getmsg")
	public ResponseEntity<String> showFromCart(){
		return ResponseEntity.ok("From the cart Rest service "+port);
	}
	
}
