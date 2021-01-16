package com.iosoft2020.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class WebConfig {

	@Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
    	return new ServletRegistrationBean(new HystrixMetricsStreamServlet(),"/actuator/hystrix.stream");
    }

}
