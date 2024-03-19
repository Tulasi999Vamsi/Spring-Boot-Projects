package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Userdao;
import com.entity.User;

@Service
public class UserService 
{
    @Autowired
	private Userdao userdao;
    
   
	public User saveUser(User user) {
	
		 return userdao.save(user);
	}
    
	public User finduser(int id)
	{
		return userdao.findById(id).orElse(null);
	}
	
	public List<User> findAll()
	{
		return userdao.findAll();
	}
	public void delete(int id)
	{
		 userdao.deleteById(id);
	}
    
    
}
