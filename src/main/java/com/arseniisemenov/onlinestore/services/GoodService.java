package com.arseniisemenov.onlinestore.services;

import com.arseniisemenov.onlinestore.dao.GoodDao;
import com.arseniisemenov.onlinestore.models.GoodEntity;

import java.util.List;

public class GoodService {
    private GoodDao goodDao;
    public GoodService() {
        goodDao = new GoodDao();
    }

    public List<GoodEntity> findAllGoods() {
        return goodDao.findAll();
    }
}
