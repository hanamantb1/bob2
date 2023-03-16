package com.medicare.bob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.bob.entity.Customer;
import com.medicare.bob.service.CustomerService;

@RestController
public class CustomerController {


	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllExpenses() {

		return customerService.getAllCustomer();
	}
}
