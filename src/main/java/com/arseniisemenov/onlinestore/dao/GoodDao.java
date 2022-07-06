package com.arseniisemenov.onlinestore.dao;

import com.arseniisemenov.onlinestore.models.GoodEntity;
import com.arseniisemenov.onlinestore.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class GoodDao {
    public List<GoodEntity> findAll() {
        List<GoodEntity> goods = (List<GoodEntity>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("FROM GoodEntity").list();
        GoodEntity test = goods.get(0);
        System.out.println(goods.get(0) instanceof GoodEntity);
        System.out.println(test.getName());
        return goods;
    }
}
