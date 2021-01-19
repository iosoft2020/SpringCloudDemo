package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul9201Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Zuul9201Application.class, args);
	}

}
