package com.dyx.user.service;

import com.dyx.common.User;
import java.util.Random;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  Random random = new Random();

  @GetMapping("/v1")
  public User user() {
    return User.builder().userId(UUID.randomUUID().toString()).name("张三").age(random.nextInt(18) + 18).height(18).build();
  }
}