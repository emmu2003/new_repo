package com.authentication.services;

import com.authentication.entities.User;

public interface UserService {
	boolean usernameExist(String username);

	void addUser(User user);

	boolean validateUser(String username, String password);


}
