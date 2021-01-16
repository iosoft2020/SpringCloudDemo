package com.iosoft2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft2020.feign.DeptWebService;
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
public class DeptConsumerController {

	@Autowired
	private DeptWebService deptWebService = null;

	@RequestMapping("/consumer/dept/list")
	public List<Dept> list() {
		return deptWebService.list();
	}

}
