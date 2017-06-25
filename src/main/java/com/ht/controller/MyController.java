package com.ht.controller;

import java.util.List;

import org.apache.catalina.core.ApplicationContextFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.alibaba.fastjson.JSON;
import com.ht.bean.User;
import com.ht.service.UserService;
import com.ht.util.SpringContextUtil;

@RestController
public class MyController {

	@Autowired
	private UserService userServiceImpl;
	
	@GetMapping(value = "/getUser", produces = "application/json; charset=utf-8")
	public String getUserById(int id) {
		User user = userServiceImpl.getUserById(id);
		String jsonString = JSON.toJSONString(user);
		return jsonString;
	}

	@GetMapping(value = "/addUser", produces = "application/json; charset=utf-8")
	public String addUser(User user) {
		
		boolean bool=userServiceImpl.addUser(user);
		System.out.println(user.getUsername()+"=====================");
		String jsonString = JSON.toJSONString(bool);
		return jsonString;
	}
	@GetMapping(value = "/delUser", produces = "application/json; charset=utf-8")
	public String delUserById(int id) {
		boolean bool = userServiceImpl.delUserById(id);
		String jsonString = JSON.toJSONString(bool);
		return jsonString;
	}
	
	@GetMapping(value = "/updateUser", produces = "application/json; charset=utf-8")
	public String updateUserById(User user) {
		boolean bool= userServiceImpl.updateUserById(user);
		String jsonString = JSON.toJSONString(bool);
		
		return jsonString;
	}
	
	@GetMapping(value = "/getAll", produces = "application/json; charset=utf-8")
	public String getAll(){
		List<User> userList = userServiceImpl.getAll();
		String actual = JSON.toJSONString(userList);
		System.out.println(userList.size());
		return actual;
	}
}
