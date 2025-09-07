package com.example.loginwala.Controller;

import com.example.loginwala.Entity.User;
import com.example.loginwala.Service.serviceuser;
import com.example.loginwala.LoginRegester.loginrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controlleruser {

    @Autowired
    serviceuser userservice;

    @PostMapping("/adduser")
    public User adduser(@RequestBody User user){
        return userservice.addUser(user);
    }
    @PostMapping("/loginUser")
    public Boolean loginUser(@RequestBody loginrequest LoginRequest){
        return userservice.loginUser(LoginRequest);
    }

    @PutMapping("/loginUser")
    public Boolean loginUserPut(@RequestBody loginrequest LoginRequest){
        return userservice.loginUser(LoginRequest);
    }















//    @PutMapping("/updateuser/{email}")
//    public User updateUser(@PathVariable String email, @RequestBody User user){
//        return userservice.updateUser(email, user);
//    }
//
//    @GetMapping("/getuser/{email}")
//    public User getUser(@PathVariable String email){
//        return userservice.getUser(email);
//    }
//
//    @DeleteMapping("/deleteuser/{email}")
//    public String deleteUser(@PathVariable String email){
//        return userservice.deleteUser(email);
//    }

//    @PostMapping("/loginUser")
//    public Boolean loginUser(@RequestBody  )

}
