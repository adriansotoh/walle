package com.eureka.walle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WalleEurekaServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalleEurekaServiciosApplication.class, args);
	}

}
