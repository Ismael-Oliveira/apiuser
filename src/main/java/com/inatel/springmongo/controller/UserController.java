package com.inatel.springmongo.controller;

import com.inatel.springmongo.model.User;
import com.inatel.springmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return this.userService.getUser(id);
    }

    @PostMapping
    public User create(@RequestBody User user){
        return this.userService.create(user);
    }
}
