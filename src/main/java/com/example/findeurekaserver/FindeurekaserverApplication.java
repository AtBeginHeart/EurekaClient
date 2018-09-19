package com.example.findeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient //启动EnableEureka客户端
@SpringBootApplication
public class FindeurekaserverApplication {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		System.out.println(name+" welcome . My is microservice provider user");
		return name+" welcome . My is microservice provider user";
	}
	public static void main(String[] args) {
		SpringApplication.run(FindeurekaserverApplication.class, args);
	}
}
