package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/showUsers")
public class MVC_User_Controller 
{
	@Autowired
	public UserService userservice;
	
	@GetMapping("/List")
	public String showList(Model themodel)
	{
		List<User> theusers=userservice.findAll();
		themodel.addAttribute("users", theusers);
		return "list-users";
	}
	
	@GetMapping("/addNewUser")
	public String addUser(Model themodel)
	{
		User theusers=new User();
		theusers.setId(null);
		themodel.addAttribute("newUser", theusers);
        
		return "addUser";
		
		
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("newUser") User user)
	{
		userservice.saveUser(user);
		return "redirect:/showUsers/List";
	}
	
	@GetMapping("/updateUser")
	public String update(@RequestParam("user_id") int theId,Model themodel)
	{
		User user=userservice.finduser(theId);
		themodel.addAttribute("newUser", user);
		return "addUser";
	}
	
	@GetMapping("/deleteUser")
	public String delete(@RequestParam("user_id") int theId)
	{
	     userservice.delete(theId);
		return "redirect:/showUsers/List";
	}

}
