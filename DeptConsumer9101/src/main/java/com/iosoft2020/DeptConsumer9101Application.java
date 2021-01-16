package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer9101Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer9101Application.class, args);
	}

}
