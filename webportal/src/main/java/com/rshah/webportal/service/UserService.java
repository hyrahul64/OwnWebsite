package com.rshah.webportal.service;



public interface UserService {

	boolean authenticateUser(String username, String password);
	
	boolean createUser(String username, String password,
			String firstName, String lastName, String email);
	
	boolean checkUsernameAvailibility(String username);
}
