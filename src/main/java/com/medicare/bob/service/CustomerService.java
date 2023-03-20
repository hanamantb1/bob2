package com.medicare.bob.service;

import java.util.List;
import java.util.Optional;

import com.medicare.bob.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomer();

	Customer saveCustomer(Customer customer);

    void deletecustomerById(Long id);



	Optional<Customer> getCustomerById(Long id);

	
}
