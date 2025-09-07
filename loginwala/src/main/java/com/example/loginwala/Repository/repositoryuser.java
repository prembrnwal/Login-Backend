package com.example.loginwala.Repository;

import com.example.loginwala.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryuser extends JpaRepository<User,String> {
}
