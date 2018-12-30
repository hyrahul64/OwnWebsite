package com.rshah.webportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rshah.webportal.common.UserRole;
import com.rshah.webportal.domain.User;
import com.rshah.webportal.jpa.UserRepository;

@SpringBootApplication( /*exclude = {SecurityAutoConfiguration.class}*/)
public class WebportalApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(WebportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("run function");
		
		User me = new User("hyrahul64","rahul", "shah", "mynameis90","hyrahul64@gmail.com",UserRole.OWNER.name());
		
		userRepository.save(me);
		
	}
	
	
}
