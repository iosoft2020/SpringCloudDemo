package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider9002Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider9002Application.class, args);
	}

}
