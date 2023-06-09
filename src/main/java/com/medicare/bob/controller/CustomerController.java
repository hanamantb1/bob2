package com.medicare.bob.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.bob.entity.Customer;
import com.medicare.bob.service.CustomerService;

@RestController
public class CustomerController {


	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {

		return customerService.getAllCustomer();
	}
	
	@GetMapping("/customerById")
	public Optional<Customer> getCustomerById(@RequestParam Long id){
		return customerService.getCustomerById(id);
		
	}
   
	
	
	@PostMapping("/savecustomer")
	public ResponseEntity<String> saveCustomerDetails(@RequestBody Customer customer) {
		try {
		 customerService.saveCustomer(customer);
	
		 return new ResponseEntity<>("User Created Successfully "+ customer.getFirst_name(),HttpStatus.OK);
		}
		catch(DataAccessException e) {
			 return new ResponseEntity<>("Somthing went wrong ",HttpStatus.OK);
		}

	}
	
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@DeleteMapping("/customerdeleteByID")
	public void deletcustomerById(@RequestParam Long id) {
	
		
		customerService.deletecustomerById(id);

		
	}
	
	
	
}
