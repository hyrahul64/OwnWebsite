package com.rshah.webportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage()
	{
		return "html/home.html";
	}
	
	@RequestMapping(value = "/html/login",method = RequestMethod.GET)
	public String getPersonalPage(@RequestParam("userName") String userName,
			@RequestParam("password") String password)
	{
		System.out.println("getPersonalPage()");
		System.out.println("user name:" + userName + " password:" + password);
		
		if(userName == "rahul" && password == "rahul444")
		{
			return "html/personal.html";
		}
		else
		{
			return "";
		}
	}
}
	
