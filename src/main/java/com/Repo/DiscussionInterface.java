package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Discussion;
@Repository
public interface DiscussionInterface extends JpaRepository<Discussion, Long> {

}  
