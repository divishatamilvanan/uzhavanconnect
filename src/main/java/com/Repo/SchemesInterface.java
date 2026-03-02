package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Schemes;

@Repository
public interface SchemesInterface extends JpaRepository<Schemes, Long> {

} 
