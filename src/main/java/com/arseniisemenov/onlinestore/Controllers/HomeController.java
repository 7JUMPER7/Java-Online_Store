package com.arseniisemenov.onlinestore.Controllers;

import com.arseniisemenov.onlinestore.Models.MyGoodEntity;
import com.arseniisemenov.onlinestore.Services.GoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index"})
    public String Index(Map<String, Object> model) {
        GoodService goodService = new GoodService();
        List<MyGoodEntity> goods = goodService.getAll();
        System.out.println("\n\n\nGOOD NAME:");

//        MyGoodEntity test = goods.get(0);
//        System.out.println(test.getClass());
//        for(MyGoodEntity good : goods) {
//            System.out.println(good.getName());
//        }

        model.put("goods", goods);
        return "/index";
    }

    @GetMapping(value = "/403")
    public String Error403() {
        return "/errors/403";
    }
}
