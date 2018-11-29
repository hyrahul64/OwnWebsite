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
		return "html/home.html";
	}
}
	
