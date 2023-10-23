package com.securityy.Springbootsecurit.controllers;

import com.securityy.Springbootsecurit.models.User;
import com.securityy.Springbootsecurit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

//    single user

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        return this.userService.getUser(username);
    }

//    add user
    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
