package com.springboot.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Part2Application {
	public static void main(String[] args) {
		SpringApplication.run(Part2Application.class, args);
		FakeRepo fakeRepo = new FakeRepo();
		System.out.println(fakeRepo.insertUser(1,"Kagiso","Raseroka"));
		System.out.println(fakeRepo.insertUser(2,"John","Michael"));
		System.out.println(fakeRepo.insertUser(3,"John","Doe"));
		System.out.println(fakeRepo.findUserById(2));
		UserServiceImpl userService = new UserServiceImpl();
		System.out.println(userService.addUser(2,"Johnny","Walker"));
		System.out.println(userService.removeUser(2));
	}
}