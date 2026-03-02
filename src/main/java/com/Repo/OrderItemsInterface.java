package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Order_Items;
@Repository
public interface OrderItemsInterface extends JpaRepository<Order_Items, Long> {

} 
