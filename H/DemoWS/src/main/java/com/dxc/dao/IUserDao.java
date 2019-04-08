package com.dxc.dao;

import java.util.List;

import com.dxc.model.User;

public interface IUserDao {
	
	public List<User> getAllUser();
	
	public void insertUser(User user);
	
	public void updateUser(User user);
}
