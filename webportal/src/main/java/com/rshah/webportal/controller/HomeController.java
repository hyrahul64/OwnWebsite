package com.rshah.webportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage()
	{
		return "home.html";
	}
	
	@RequestMapping(value="about", method = RequestMethod.GET)
	public String getAboutPage()
	{
		return "about.html";
	}

	@RequestMapping(value="personal", method = RequestMethod.GET)
	public String getPersonalPage()
	{
		return "personal.html";
	}
}
	
