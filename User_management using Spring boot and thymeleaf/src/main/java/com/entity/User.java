package com.entity;
import jakarta.persistence.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Component
@Entity
@Table(name="Users_table")
public class User 
{
	@Id
	@Column(name="id")
	public Integer id;
	
	@Column(name="user_name")
	public String name;
	
	@Column(name="user_email")
	public String email;
	
	public User()
	{
		super();
	
	}

	public User(Integer id, String name, String email) {
	     super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
