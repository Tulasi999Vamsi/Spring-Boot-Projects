package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class Helloworldcontroller 
{
    @GetMapping("/showForm")
	public String showForm(Model themodel)
	{
	
		return "Helloworld-form";
	}
    
    @RequestMapping("/submit")
    public String form(@RequestParam("userName") String theName,Model themodel)
    {
    	
    	theName=theName.toUpperCase();
    	return "Helloworld";
    }
  
}
