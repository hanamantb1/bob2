package com.medicare.bob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.bob.entity.Dependent;

public interface DependentRepository extends JpaRepository<Dependent, Long> {

}
