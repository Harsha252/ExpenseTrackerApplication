package com.expensetracker.ExpenseTracker.controller;

import java.util.List;

import com.expensetracker.ExpenseTracker.model.Users;
import com.expensetracker.ExpenseTracker.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersServices usersServices;

    @GetMapping("getusers")
    public List<Users> getusers() {
        return usersServices.getusers();
    }

    @PostMapping("postusers")
    public void Users(@RequestBody Users users) {
        usersServices.saveUsers(users);
    }
}
