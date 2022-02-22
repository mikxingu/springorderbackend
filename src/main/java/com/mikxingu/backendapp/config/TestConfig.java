package com.mikxingu.backendapp.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mikxingu.backendapp.entities.Order;
import com.mikxingu.backendapp.entities.User;
import com.mikxingu.backendapp.repositores.OrderRepository;
import com.mikxingu.backendapp.repositores.UserRepository;

@Configuration
@Profile("test") // RUNS ONLY ON TEST PROFILE
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User (null, "Maria Brown", "maria@gmail.com", "988776655", "123456");
		User u2 = new User (null, "Sheldon Cooper", "sheldon@gmail.com", "955667788", "654321");
		
		Order o1 = new Order(null, Instant.parse("2022-02-20T16:54:23Z"), u1);
		Order o2 = new Order(null, Instant.parse("2022-02-21T20:43:23Z"), u2);
		Order o3 = new Order(null, Instant.parse("2022-02-19T13:32:23Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
	
}
