package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Farmers;

@Repository
public interface FarmersInterface extends JpaRepository<Farmers, Long> {

} 
