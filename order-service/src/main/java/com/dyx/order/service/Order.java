package com.dyx.order.service;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
  private String userId;
  private String name;
  private String userName;
  private int number;
}