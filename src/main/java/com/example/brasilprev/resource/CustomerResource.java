package com.example.brasilprev.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.brasilprev.model.Customer;
import com.example.brasilprev.repository.CustomerRepository;


@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> list(){
		return customerRepository.findAll();
	}
	
	
}
