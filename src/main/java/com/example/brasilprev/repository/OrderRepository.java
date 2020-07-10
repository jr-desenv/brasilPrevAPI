package com.example.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.brasilprev.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
