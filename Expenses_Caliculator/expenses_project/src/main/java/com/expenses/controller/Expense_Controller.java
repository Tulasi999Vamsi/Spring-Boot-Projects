package com.expenses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expenses.Models.Expense;
import com.expenses.Service.Expense_Service;

@Controller
public class Expense_Controller
{
	@Autowired
	private Expense_Service exp_service;
	
	@PostMapping("/save")
	public String save(@ModelAttribute("newExpense") Expense expense)
	{
		 exp_service.save(expense);
		 return "redirect:/expenses";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("expense_id") Long expenseId)
	{
		exp_service.delete(expenseId);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String findall(Model model)
	{
		List<Expense>res=exp_service.findall();
		
		double totalAmount=res.stream()
				.mapToDouble(Expense::getAmount)
				.sum();
	    model.addAttribute("expenses",res);
	    model.addAttribute("totalAmount",totalAmount);
	    
		return "ExpensesDisplay";
	}
	
	@GetMapping("/addExpense")
	public String add(Model model)
	{
		Expense exp=new Expense();
		model.addAttribute("newExpense",exp);
		return "addExpense";
		
	}
	

}
