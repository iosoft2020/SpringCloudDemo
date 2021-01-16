package com.iosoft2020.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft2020.pojo.Dept;
import com.iosoft2020.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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

	@GetMapping("/list")
	@HystrixCommand(fallbackMethod = "listHystrix")
	public List<Dept> list() {

		List<Dept> depts = deptService.list();

//		if (depts.size() > 0) {
//			throw new RuntimeException("test exception");
//		}

		return depts;
	}

	public List<Dept> listHystrix() {

		Dept dept = new Dept();
		dept.setDeptName("hystrix test");
		return Arrays.asList(dept);
	}

}
