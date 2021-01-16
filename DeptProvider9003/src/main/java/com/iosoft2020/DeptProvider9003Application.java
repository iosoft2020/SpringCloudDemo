package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider9003Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider9003Application.class, args);
	}

}
