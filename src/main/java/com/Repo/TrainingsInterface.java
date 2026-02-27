package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Trainings;
@Repository
public interface TrainingsInterface extends JpaRepository<Trainings, Long> {

} 
