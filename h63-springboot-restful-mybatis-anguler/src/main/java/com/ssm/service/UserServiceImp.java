package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssm.dao.UserDao;
import com.ssm.model.User;

@Component
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(int id) {
		// return userMapper.selectByPrimaryKey(id);
		return userDao.selectByPrimaryKey(id);

	}

	@Override
	public List<User> findAllUser() {
		return userDao.findAll();

	}

	@Override
	public void saveUser(User user) {
		userDao.addUser(user);
		;

	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteByPrimaryKey(id);

	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

}
