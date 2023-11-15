package com.example.StudentCURD.Service;

import com.example.StudentCURD.Model.User;
import com.example.StudentCURD.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    UserRepo userRepo;


    public List<User> getUsers() {
        return userRepo.findAll();
    }


    public User getUser(int id) {
        return userRepo.findById(id).orElse(null);
    }


    public User addUser(User user) {
        userRepo.save(user);
        return user;
    }


    public User updateUser(User user, int id) {
        User oldData=null;
        oldData=userRepo.findById(id).get();
        oldData.setName(user.getName());
        oldData.setUsername(user.getUsername());
        oldData.setEmail(user.getEmail());
        return userRepo.save(oldData);


    }


    public String deleteUser(int id) {
        userRepo.deleteById(id);
        return "Deleted";

    }


}
