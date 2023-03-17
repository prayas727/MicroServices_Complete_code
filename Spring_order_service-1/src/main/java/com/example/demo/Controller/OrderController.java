package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ConsumerCartService.CartConsumerService;
import com.example.demo.beans.Pojo;

@RestController
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
	@GetMapping("/orderMsg/{id}")
	public ResponseEntity<Pojo> getOrderwithPojo(@PathVariable Integer id)
	{
		
		String cm=consumer.getCartData();
		return ResponseEntity.ok(new Pojo(id,"Prayas"));
	}
	
}
