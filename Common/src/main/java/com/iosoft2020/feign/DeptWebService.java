package com.iosoft2020.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.iosoft2020.pojo.Dept;
import com.iosoft2020.service.DeptFallCallBackService;

@FeignClient(value = "DEPTPROVIDER", fallbackFactory = DeptFallCallBackService.class)
@Component
public interface DeptWebService {

	@GetMapping("/dept/list")
	public List<Dept> list();

}
