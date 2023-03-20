package com.medicare.bob.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.bob.entity.Customer;
import com.medicare.bob.entity.Dependent;
import com.medicare.bob.repository.CustomerRepository;
import com.medicare.bob.repository.DependentRepository;

@Service
public class CustomerServiceImpl implements CustomerService  {

	@Autowired 
	CustomerRepository customerRepo;
	
	@Autowired 
	DependentRepository dependentRepo;
	
	
	@Override
	public List<Customer> getAllCustomer() {
	
		return customerRepo.findAll();
		
	}

	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub

		
		Customer k=customerRepo.save(customer);
		
		for(Dependent d :customer.getDependent())
		{
			d.setCustomer(k);
			dependentRepo.save(d);
		}

		return customer;
	}

	@Override
	public void deletecustomerById(Long id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		
	}

	@Override
	public Optional<Customer> getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id);
	}

	



}
