package com.expensetracker.ExpenseTracker.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eid;

    @Column(name= "first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    @Column(name="emailId")
    private String emailId;

    @Column(name="company_name")
    private String companyName;
    @Column(name="is_superAdmin",nullable = false)
    private int is_sa;
    @Column(name="is_admin",nullable = true)
    private int is_ad;

    @Column(name="is_employee",nullable = false)
    private int is_emp;

    @Column(name="password")
    private String password;


}
