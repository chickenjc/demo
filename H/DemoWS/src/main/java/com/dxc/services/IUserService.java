package com.dxc.services;

import java.util.List;

import com.dxc.model.User;

public interface IUserService {
	
	public List<User> getAllUser();
	
	public void insertUser(User user);
}
