package com.expensetracker.ExpenseTracker.controller;

import com.expensetracker.ExpenseTracker.model.Users;
import com.expensetracker.ExpenseTracker.repository.UsersRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;
    @GetMapping
    public List<Users> getAllUsers(){
        return  usersRepository.findAll();
    }

}
