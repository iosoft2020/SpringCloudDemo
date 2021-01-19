package com.iosoft2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer9301Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigServer9301Application.class, args);
	}

}