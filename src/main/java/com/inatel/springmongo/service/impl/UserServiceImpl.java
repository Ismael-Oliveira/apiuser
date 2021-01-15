package com.inatel.springmongo.service.impl;

import com.inatel.springmongo.model.User;
import com.inatel.springmongo.repository.UserRepository;
import com.inatel.springmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User getUser(String id) {
        return this.userRepository.findById(id).orElseThrow(()->null);
    }
}
