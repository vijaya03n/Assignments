package com.example.assignment3;

import com.example.assignment3.repository.UserRepo;
import com.example.assignment3.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Assignment3Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Assignment3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setEmail("vijaya@gmail.com");
		user1.setUsername("vijaya");
		user1.setPassword(bCryptPasswordEncoder.encode("vijaya@123"));
		user1.setRole("ROLE_ADMIN");

		userRepo.save(user1);

		User user2 = new User();
		user2.setEmail("sheldon@gmail.com");
		user2.setUsername("sheldon");
		user2.setPassword(bCryptPasswordEncoder.encode("sheldon@123"));
		user2.setRole("ROLE_NORMAL");

		userRepo.save(user2);
	}

}
