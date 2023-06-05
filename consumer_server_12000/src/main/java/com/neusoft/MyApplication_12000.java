package com.neusoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//开启Spring Cloud Feign的支持功能
@EnableFeignClients
public class MyApplication_12000 {

	/**
	 * @LoadBalanced , 是ribbon提供的负载均衡注解。
	 * 让RestTemplate在请求时拥有客户端负载均衡的能力
	 * 
     * 使用spring提供的RestTemplate发送http请求调用微服务
     * 这里创建RestTemplate对象交给容器管理
     */
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication_12000.class, args);
	}
}
