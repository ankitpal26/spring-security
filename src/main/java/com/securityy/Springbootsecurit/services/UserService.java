package com.securityy.Springbootsecurit.services;

import com.securityy.Springbootsecurit.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
       list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","xyz","xyz@gmail.com"));

    }

    //get all userss
    public List<User> getAllUsers(){
        return this.list;
    }

    //get single user
    public User getUser(String username){
        return this.list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.addUser(user);
        return user;
    }
}
