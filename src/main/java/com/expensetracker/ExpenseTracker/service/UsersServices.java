package com.expensetracker.ExpenseTracker.service;

import java.util.List;

import com.expensetracker.ExpenseTracker.model.Users;
import com.expensetracker.ExpenseTracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsersServices {

    @Autowired
    UsersRepository usersRepository;

    public UsersServices() {

    }
    public List<Users> getusers(){
        return usersRepository.findAll();

    }
    public void saveUsers(Users users) {
        usersRepository.save(users);
    }

}