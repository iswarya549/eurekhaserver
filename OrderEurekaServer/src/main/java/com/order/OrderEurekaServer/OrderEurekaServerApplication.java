package com.order.OrderEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OrderEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderEurekaServerApplication.class, args);
	}

}
