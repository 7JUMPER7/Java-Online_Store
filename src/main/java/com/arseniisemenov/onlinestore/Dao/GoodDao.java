package com.arseniisemenov.onlinestore.Dao;

import com.arseniisemenov.onlinestore.Models.MyGoodEntity;
import com.arseniisemenov.onlinestore.Utils.HibernateSessionFactoryUtil;

import java.util.List;

public class GoodDao {
    public List<MyGoodEntity> getAll() {
        List<MyGoodEntity> goods = (List<MyGoodEntity>)HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("FROM MyGoodEntity ").list();
        System.out.println(goods.getClass());
        MyGoodEntity test = goods.get(0);
//        return (List<GoodEntity>)goods;
//        MyGoodEntity test = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(MyGoodEntity.class, 1);
        return goods;
    }
}
