package com.example.loginwala.Service;

import com.example.loginwala.Entity.User;
import com.example.loginwala.Repository.repositoryuser;
import com.example.loginwala.LoginRegester.loginrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class serviceuser {

    @Autowired
    repositoryuser repo;

    public User addUser(User user){
        return repo.save(user);
    }

    public Boolean loginUser(loginrequest LoginRequest){
        Optional<User> user = repo.findById(LoginRequest.getUserId());
        if (!user.isPresent()){
            return false;
        }
        User user1 = user.get();

        if(!user1.getPassword().equals(LoginRequest.getPassword())) {
            return false;
        }

        return true;
    }
}
