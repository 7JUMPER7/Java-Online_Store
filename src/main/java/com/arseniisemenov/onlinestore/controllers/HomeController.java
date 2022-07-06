package com.arseniisemenov.onlinestore.controllers;

import com.arseniisemenov.onlinestore.models.GoodEntity;
import com.arseniisemenov.onlinestore.models.UserEntity;
import com.arseniisemenov.onlinestore.services.GoodService;
import com.arseniisemenov.onlinestore.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index"})
    public String Index(Map<String, Object> model) {
//        GoodService goodService = new GoodService();
//        List<GoodEntity> goods = goodService.findAllGoods();
//        System.out.println(goods);

//        UserService userService = new UserService();
//        List<UserEntity> users = userService.getAll();
//        System.out.println("\n\n\nGOOD NAME:");
//        System.out.println(users.get(0).getClass());

//        MyGoodEntity test = goods.get(0);
//        System.out.println(test.getClass());
//        for(MyGoodEntity good : goods) {
//            System.out.println(good.getName());
//        }

//        model.put("goods", goods);
        return "/index";
    }

    @GetMapping(value = "/403")
    public String Error403() {
        return "/errors/403";
    }
}
