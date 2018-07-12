package com.leroy.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/jenkins")
	public Object test(){
		HashMap<String, Object> datas = new HashMap<String,Object>();
		datas.put("status", "up");
		datas.put("msg", "jenkins test");
		return datas;
	}
}
