package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashBoard9103Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumerHystrixDashBoard9103Application.class, args);
	}

}
