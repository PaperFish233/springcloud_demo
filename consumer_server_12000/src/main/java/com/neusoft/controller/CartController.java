package com.neusoft.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.feign.UserFeignClient;
import com.neusoft.po.CommonResult;

@RestController
@RequestMapping("/cart")
public class CartController {

//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@Autowired
//	private DiscoveryClient discoveryClient;

//	@GetMapping("/getUserById/{userId}")
//	public CommonResult getUserById(@PathVariable("userId") Integer userId){
//				
//		//使用微服务名替换IP地址和端口
//		CommonResult result = restTemplate.getForObject(
//	           "http://provider-server/user/getUserById/"+userId, CommonResult.class);
//		return result;
//	}
	
	//注入Fegin接口（@EnableFeignClients自动扫描@FeignClient注解）
	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/getUserById/{userId}")
	public CommonResult getUserById(@PathVariable("userId") Integer userId){
		//使用Fegin接口进行服务调用
		return userFeignClient.getUserById(userId);
	}
	
	
}
