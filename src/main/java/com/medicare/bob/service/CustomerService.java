package com.medicare.bob.service;

import java.util.List;

import com.medicare.bob.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomer();

	

	Customer saveCustomer(Customer customer);

	
}
