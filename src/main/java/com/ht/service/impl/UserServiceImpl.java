package com.ht.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ht.bean.User;
import com.ht.dao.UserMapper;
import com.ht.service.UserService;
@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	public boolean delUserById(long id) {
		// TODO Auto-generated method stub
		return userMapper.delUserById(id);
	}

	public boolean updateUserById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUserById(user);
	}

	public List<User> getAll() {
		PageHelper.startPage(1,5);
		return userMapper.getAll();
	}

}
