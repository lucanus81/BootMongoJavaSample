package com.luca.bootmongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luca.bootmongo.dal.UserDAL;
import com.luca.bootmongo.model.User;
import com.luca.bootmongo.model.UserRepository;

@RestController
@RequestMapping(value = "/")
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final UserRepository users;
	private final UserDAL dal;
	
	public UserController(UserRepository users, UserDAL dal) {
		this.users = users;
		this.dal = dal;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		logger.info("Getting all users...");
		return users.findAll();
	}
	
	@RequestMapping(value = "/allwithdal", method = RequestMethod.GET)
	public List<User> getAllUsersWIthDAL() {
		logger.info("Getting all users...");
		return dal.getAllUsers();
	}
}
