package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka7003Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Eureka7003Application.class, args);
	}

}
