package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Pojo;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
private	FeignProvider fp;
	@GetMapping("/user")
	public ResponseEntity<String> getLoginData()
	{
		return ResponseEntity.ok("From:Login showing order data"+fp.findData().getBody());
	}
	@GetMapping("/user/pojo/{id}")
	public ResponseEntity<Pojo> getLoginData(@PathVariable Integer id)
	{
		return ResponseEntity.ok(fp.getOrderwithPojo(id).getBody());
	}

}
