package com.expensetracker.ExpenseTracker.controller;

import java.util.List;

import com.expensetracker.ExpenseTracker.model.Users;
import com.expensetracker.ExpenseTracker.service.UsersServices;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UsersController {

    @Autowired
    private UsersServices usersServices;
    @PostMapping("postingusers")
    public ResponseEntity<Users> createUsers(@Valid @RequestBody Users users){
       Users savedusers =  usersServices.createUser(users);
       return  new ResponseEntity<Users>(savedusers, HttpStatus.CREATED);

    }

}
