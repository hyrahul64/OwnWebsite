package com.rshah.webportal.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
/*		http
		.authorizeRequests()
			.antMatchers("/personal/**").authenticated()
			.antMatchers("/**").permitAll()
			.and()
		.formLogin();*/
		
		http
		.headers()
		.frameOptions()
		.disable();
		
		//This allows POST req handling
		http
		.csrf()
		.disable();
		
	}

}
