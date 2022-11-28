package com.gateway.walle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WalleGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalleGatewayApplication.class, args);
	}

}
