package com.example.StudentCURD.Controller;


import com.example.StudentCURD.Model.User;
import com.example.StudentCURD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3003")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users/")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PutMapping("/userUpdate/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id) {
        return userService.updateUser(user,id);
    }

    @PostMapping("/userDelete/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

}
