package com.example.shop.service;

import com.example.shop.model.entity.User;
import com.example.shop.model.service.UserServiceModel;
import com.example.shop.model.view.UserViewModel;

import java.util.List;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);

    List<UserViewModel> findAllUserAndCountOfOrdersOrderByCountDesc();
}
