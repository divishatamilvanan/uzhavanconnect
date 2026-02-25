package com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Review_Id;
	private Long Consumer_Id;
	private Long Product_Id;
	private Long Rating;
	private String Subtotal;
<<<<<<< HEAD
	
=======
	private Long Subto;
>>>>>>> ce44f8474b61a9803090807baed01173529b1f12
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;


}
