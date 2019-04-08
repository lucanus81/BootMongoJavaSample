package com.luca.bootmongo.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.luca.bootmongo.model.User;

@Repository
public class UserDALImpl implements UserDAL {

	@Autowired
	private MongoTemplate db;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return db.findAll(User.class);
	}

}
