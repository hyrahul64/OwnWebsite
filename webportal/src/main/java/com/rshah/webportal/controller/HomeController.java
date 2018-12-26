package com.rshah.webportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage()
	{
		return "home";
	}
	
	@RequestMapping(value = "/html/login",method = RequestMethod.POST)
	public ModelAndView getPersonalPage(@RequestParam("userName") String userName,
			@RequestParam("password") String password)
	{
		System.out.println("getPersonalPage()");
		System.out.println("user name:" + userName + " password:" + password);
		
		if(userName.compareTo("rahul") == 0 && 
				password.compareTo("rahul444") == 0)
		{
			System.out.println("validated password");
			ModelAndView modelView = new ModelAndView();
			modelView.setViewName("personal");
			//This didn't work in way I thought
			//returned view 'personal' is replaced at login view (caller) so no
			//need to do like this
/*			modelView.addObject("iframe",
					"personal.html");*/
			return modelView;
		
		}
		else
		{
			return null;
		}
	}
}
	
