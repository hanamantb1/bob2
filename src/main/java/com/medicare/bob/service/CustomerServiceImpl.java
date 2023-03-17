package com.medicare.bob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.bob.entity.Customer;
import com.medicare.bob.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService  {

	@Autowired 
	CustomerRepository customerRepo;
	
	@Override
	public List<Customer> getAllCustomer() {
	
		return customerRepo.findAll();
		
	}

	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	



}
