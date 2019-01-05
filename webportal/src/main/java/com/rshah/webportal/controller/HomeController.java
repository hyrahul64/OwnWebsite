package com.rshah.webportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rshah.webportal.service.UserService;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage()
	{
		return "home";
	}
	
	@RequestMapping(value = "/html/login",method = RequestMethod.POST)
	public ModelAndView getPersonalPage(@RequestParam("userName") String username,
			@RequestParam("password") String password)
	{
		System.out.println("getPersonalPage()");
		System.out.println("user name:" + username + " password:" + password);
		
		if(userService.authenticateUser(username, password) == true)
		{
			System.out.println("validated password");
			ModelAndView modelView = new ModelAndView();
			modelView.setViewName("personal");
			modelView.addObject("user", username);
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
	
	@RequestMapping(value = "/html/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("userName") String username,
			@RequestParam("password") String password, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email)
	{
		userService.createUser(username, password, firstName, lastName, email);
		return null;
	}
}
	
