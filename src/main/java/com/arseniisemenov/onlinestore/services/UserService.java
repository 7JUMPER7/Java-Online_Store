package com.arseniisemenov.onlinestore.services;

import com.arseniisemenov.onlinestore.dao.UserDao;
import com.arseniisemenov.onlinestore.models.UserEntity;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public List<UserEntity> getAll() {
        List<UserEntity> users = userDao.getAll();
        System.out.println("SERVICE: ");
        System.out.println(users);
        return users;
    }
}
