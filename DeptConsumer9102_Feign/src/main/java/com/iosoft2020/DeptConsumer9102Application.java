package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = { "com.iosoft2020" })
@ComponentScan("com.iosoft2020")
public class DeptConsumer9102Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer9102Application.class, args);
	}

}
