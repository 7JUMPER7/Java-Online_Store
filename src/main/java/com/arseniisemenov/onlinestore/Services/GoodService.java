package com.arseniisemenov.onlinestore.Services;

import com.arseniisemenov.onlinestore.Dao.GoodDao;
import com.arseniisemenov.onlinestore.Models.MyGoodEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodService {
    private GoodDao goodDao;

    @Autowired
    public GoodService() {
        goodDao = new GoodDao();
    }

    public List<MyGoodEntity> getAll() {
        List<MyGoodEntity> goods = goodDao.getAll();
        System.out.println("SERVICE: ");
        System.out.println(goods);
        return goods;
    }
}
