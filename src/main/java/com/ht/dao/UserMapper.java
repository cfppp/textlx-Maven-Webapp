package com.ht.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.ht.bean.User;

@MapperScan
public interface UserMapper {
	//通过id获取用户
	public User getUserById(long id);
	//向数据库中添加数据
	public boolean addUser(User user);
	//通过用户id删除用户
	public boolean delUserById(long id);
	//更改用户信息通过用户id
	public boolean updateUserById(User user);
	
	public List<User> getAll();
}
