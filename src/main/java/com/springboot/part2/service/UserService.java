package com.springboot.part2.service;

public interface UserService {
    String addUser(long Id, String name, String surname);
    String removeUser(long Id);
    String getUser(long Id);
}