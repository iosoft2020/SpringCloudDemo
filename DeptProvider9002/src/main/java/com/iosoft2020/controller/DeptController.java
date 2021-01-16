package com.iosoft2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft2020.pojo.Dept;
import com.iosoft2020.service.DeptService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author iosoft2020
 * @since 2021-01-14
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/list")
	public List<Dept> list() {
		return deptService.list();
	}

	@GetMapping("/servers")
	public Object servers() {

		List<String> services = discoveryClient.getServices();

		//		services.forEach(service->{
		//			System.err.println(service);
		//		});

		services.forEach(System.err::println);

		discoveryClient.getInstances(services.get(0)).forEach(System.err::println);

		return discoveryClient;
	}

}
