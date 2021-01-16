package com.iosoft2020.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iosoft2020.feign.DeptWebService;
import com.iosoft2020.pojo.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptFallCallBackService implements FallbackFactory<DeptWebService> {

	@Override
	public DeptWebService create(Throwable cause) {
		return new DeptWebService() {

			@Override
			public List<Dept> list() {
				Dept dept = new Dept();

				dept.setDeptName("fall call back test");

				return Arrays.asList(dept);
			}};
	}

}
