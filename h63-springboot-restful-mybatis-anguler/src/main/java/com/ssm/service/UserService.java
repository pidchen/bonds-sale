package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

public interface UserService {

	public User getUserById(int id);

	public List<User> findAllUser();

	public void saveUser(User user);

	public void deleteUser(int id);

	public void updateUser(User user);

}
