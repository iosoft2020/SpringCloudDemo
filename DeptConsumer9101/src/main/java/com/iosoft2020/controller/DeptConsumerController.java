package com.iosoft2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iosoft2020.pojo.Dept;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author iosoft2020
 * @since 2021-01-14
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

	//	private String url = "http://localhost:9001";    // url
	private String url = "http://DEPTPROVIDER"; // ribbon
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(url + "/dept/list", List.class);
	}

}
