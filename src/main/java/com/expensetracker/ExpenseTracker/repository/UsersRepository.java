package com.expensetracker.ExpenseTracker.repository;



import com.expensetracker.ExpenseTracker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long>{


}
