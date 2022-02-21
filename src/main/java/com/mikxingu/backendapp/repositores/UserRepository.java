package com.mikxingu.backendapp.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikxingu.backendapp.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	
	 

}
