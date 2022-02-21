package com.mikxingu.backendapp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mikxingu.backendapp.entities.User;
import com.mikxingu.backendapp.repositores.UserRepository;

@Configuration
@Profile("test") // RUNS ONLY ON TEST PROFILE
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User (null, "Maria Brown", "maria@gmail.com", "988776655", "123456");
		User u2 = new User (null, "Sheldon Cooper", "sheldon@gmail.com", "955667788", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
