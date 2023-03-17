package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
/*For Load*/
//@LoadBalancerClient
public class SpringOrderService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrderService1Application.class, args);
	}

}
