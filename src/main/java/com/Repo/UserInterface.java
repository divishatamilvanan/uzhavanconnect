package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public interface UserInterface extends JpaRepository<User, Long> {

} 