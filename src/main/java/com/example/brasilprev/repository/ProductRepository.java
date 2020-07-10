package com.example.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.brasilprev.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
