package com.mikxingu.backendapp.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikxingu.backendapp.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
	
	 

}
