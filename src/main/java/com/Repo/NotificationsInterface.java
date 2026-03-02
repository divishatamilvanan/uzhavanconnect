package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model. Notifications;

@Repository
public interface NotificationsInterface extends JpaRepository< Notifications, Long> {

} 
