package com.expensetracker.ExpenseTracker;

import com.expensetracker.ExpenseTracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
