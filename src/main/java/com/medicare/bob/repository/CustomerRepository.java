package com.medicare.bob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.bob.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
