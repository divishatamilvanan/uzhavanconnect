package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Consumers;

@Repository

public interface ConsumersInterface extends JpaRepository<Consumers, Long> {

} 


