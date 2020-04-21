package com.springboot.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService{
    @Autowired
    FakeRepo fakeRepo = new FakeRepo();

    @Override
    public String addUser(long Id, String name, String surname) {
        String insert = fakeRepo.insertUser(Id,name,surname);
        return insert;
    }

    @Override
    public String removeUser(long Id) {
        return fakeRepo.deleteUser(Id);
    }

    @Override
    public String getUser(long Id) {
        return fakeRepo.findUserById(Id);
    }
}
