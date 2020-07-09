package com.example.brasilprev.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "customer")
public class Customer {
	
	private Long Id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String address;
	
	private String bithdate;
	

}
