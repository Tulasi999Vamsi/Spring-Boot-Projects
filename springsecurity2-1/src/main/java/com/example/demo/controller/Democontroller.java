package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Democontroller
{       
	@GetMapping("/")
	public String home()
	{
     return "home";
	}
	  
	@GetMapping("/showMyLoginPage")
	public String showform()
	{
		return "fancy-login";
	}
	
	@GetMapping("/leaders")
	public String leaders()
	{
		return "leaders-page";
	}
	
	@GetMapping("/systems")
	public String systems()
	{
		return "systems";
	}
	@GetMapping("/access-denied")
    public String showAccessDenied()
	{

	    return "access-denied";
	}
}
