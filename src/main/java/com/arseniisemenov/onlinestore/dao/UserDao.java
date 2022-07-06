package com.arseniisemenov.onlinestore.dao;

import com.arseniisemenov.onlinestore.models.UserEntity;
import com.arseniisemenov.onlinestore.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {
    public List<UserEntity> getAll() {
        List<UserEntity> users = (List<UserEntity>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("FROM UserEntity ").list();
        System.out.println(users.getClass());
        UserEntity test = users.get(0);
//        return (List<GoodEntity>)goods;
//        MyGoodEntity test = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(MyGoodEntity.class, 1);
        return users;
    }
}
