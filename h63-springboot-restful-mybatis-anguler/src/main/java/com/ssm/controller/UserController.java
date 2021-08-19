package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.model.User;
import com.ssm.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	public User findUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}

	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public List<User> findAllUser() {
		return userService.findAllUser();
	}

	@RequestMapping(value = "/api/user", method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
	public void modifyUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
	}

	/**/
	@RequestMapping(value = "/api/user", method = RequestMethod.PUT)
	public void modifyUser(@RequestBody User user) {
		userService.updateUser(user);
	}

}
