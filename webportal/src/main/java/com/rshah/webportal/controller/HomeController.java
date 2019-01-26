package com.rshah.webportal.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@RequestMapping(value="/checkUsernameAvailibility/{username}",
			method = RequestMethod.GET, produces = {"text/html"})
	@ResponseBody
	public void checkUsernameAvailibility(@PathVariable("username") String username,
			HttpServletResponse resp) throws IOException
	{
		System.out.println("Got username:"+username);
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
	   // resp.addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
	    resp.getWriter().write("<div>from server:" + username +"</div>");
		//return "<div>from server:" + username +"</div>";
		
		
	}
}
	
