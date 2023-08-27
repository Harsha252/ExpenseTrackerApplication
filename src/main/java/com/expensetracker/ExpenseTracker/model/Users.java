package com.expensetracker.ExpenseTracker.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "users")
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "name",nullable = false)
    @NotEmpty
    @Size(min = 2, message = "Please Enter Valid Name :(")
    private String name;


    @NotEmpty
    @Email
    @Size(message = "please enter valid email")
    private String email;
    @NotEmpty
    @Size(min = 8, message = "Please Enter Valid Password")
    private String password;

    public Users(){

    }
    public Users(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
