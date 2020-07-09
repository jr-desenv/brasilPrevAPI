package com.example.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.brasilprev.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
