package com.neusoft.feign;

import org.springframework.stereotype.Component;

import com.neusoft.po.CommonResult;

@Component
public class UserFeginClientCallBack implements UserFeignClient{

	//熔断降级方法
	@Override
	public CommonResult getUserById(Integer userId) {
		//403：发送的请求被服务器拒绝
		return new CommonResult(403,"fegin触发了熔断降级方法",null);
	}
}
