package com.dyx.order.service;

import com.dyx.common.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-service")
@RequestMapping("/user")
public interface UserFeign {

  @GetMapping("/v1")
  public User user();
}