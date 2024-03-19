package com.controller;
import com.entity.*;
import com.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Thymeleafcontroller 
{ 
	@Autowired
	public UserService userservice;
	
	@GetMapping("/showForm")
	public String show(Model themodel)
	{
		User theUser=new User();
		themodel.addAttribute("user",theUser);
		return "userpage";
	}
	@PostMapping("/submit")
	public String submit(@ModelAttribute("user") User user )
	{
		
		userservice.saveUser(user);
		return "success";
	}

}
