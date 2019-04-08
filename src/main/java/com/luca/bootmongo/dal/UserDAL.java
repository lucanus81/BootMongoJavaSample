package com.luca.bootmongo.dal;

import java.util.List;

import com.luca.bootmongo.model.User;

public interface UserDAL {
	public List<User> getAllUsers();
}
