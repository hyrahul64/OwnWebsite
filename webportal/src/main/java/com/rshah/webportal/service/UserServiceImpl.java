package com.rshah.webportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rshah.webportal.domain.User;
import com.rshah.webportal.jpa.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean authenticateUser(String username, String password) {
		
		List<User> users = (List<User>) userRepository.findAll();
		
		for(User user: users)
		{
			if(user.getUsername().compareTo(username) == 0)
			{
				if(user.getPassword().compareTo(password) == 0)
				{
					return true;
				}
			}
		}
		return false;
	}

}