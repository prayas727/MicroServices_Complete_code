package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringLoginService2UsingFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoginService2UsingFeignApplication.class, args);
	}

}
