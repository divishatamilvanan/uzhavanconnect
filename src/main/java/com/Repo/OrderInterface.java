package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Order;

@Repository
public interface OrderInterface extends JpaRepository<Order, Long> {

} 
