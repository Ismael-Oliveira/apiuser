package com.inatel.springmongo.service;

import com.inatel.springmongo.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User create(User user);
}
