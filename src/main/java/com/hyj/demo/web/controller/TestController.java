package com.hyj.demo.web.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyj.demo.dao.mapper.mapper1.IHyjTestMapper;
import com.hyj.demo.dao.mapper.mapper2.IHyjTestMapper2;
import com.hyj.demo.entity.po.po1.UserPO;
import com.hyj.demo.model.po.HyjTestPO;
import com.hyj.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "user相关接口")
public class TestController {
	@Autowired
	IUserService service;
	@Autowired
	IHyjTestMapper hyjMapper;
	@Autowired
	IHyjTestMapper2 hyjMapper2;

	@GetMapping("/hyjMapper")
//	@ApiOperation(value = "获取user列表", notes = "查询mysql中的用户列表")
	public HyjTestPO hyjMapper() {
		HyjTestPO hyjTestPO=hyjMapper.findOne();
		return hyjTestPO;
	}


	@PostMapping("/hyjMapper2")
	public HyjTestPO hyjMapper2() {
		HyjTestPO hyjTestPO=hyjMapper2.findOne();
		return hyjTestPO;
	}

	@GetMapping("/test3")
//	@ApiOperation(value = "获取user列表", notes = "查询mysql中的用户列表")
	public Object test3() {
		HyjTestPO hyjTestPO=hyjMapper.findOne();
		return hyjTestPO;
	}

	@GetMapping("/test4")
//	@ApiOperation(value = "获取user列表", notes = "查询mysql中的用户列表")
	public String test4() {

		return "haha";
	}

	@GetMapping("/test5")
//	@ApiOperation(value = "获取user列表", notes = "查询mysql中的用户列表")
	public Object test5() {
		HyjTestPO hyjTestPO=new HyjTestPO();

		return "haha";
	}

}