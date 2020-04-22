package com.springboot.part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Part2Application {
	public static void main(String[] args) {
		SpringApplication.run(Part2Application.class, args);
		UserServiceImpl user = new UserServiceImpl();
		System.out.println(user.addUser(1,"Kagiso","Raseroka"));
		System.out.println(user.getUser(1));
		System.out.println(user.getUser(1));
		System.out.println(user.getUser(1));
	}
}