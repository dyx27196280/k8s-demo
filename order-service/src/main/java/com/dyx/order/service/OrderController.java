package com.dyx.order.service;

import com.alibaba.fastjson.JSON;
import com.dyx.common.User;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private UserFeign userFeign;
  Random random = new Random();

  @GetMapping
  public String order() {
    User user = userFeign.user();
    Order order = new Order();
    order.setName("product" + random.nextInt(15));
    order.setUserId(user.getUserId());
    order.setUserName(user.getName());
    order.setNumber(20);
    return JSON.toJSONString(order);
  }
}