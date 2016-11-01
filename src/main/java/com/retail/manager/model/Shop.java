package com.retail.manager.model;

import lombok.Data;

@Data
public class Shop {
  private String shopName;
  private ShopAddress shopAddress;

  @Data
  public class ShopAddress {
    private int number;
    private String postCode;
  }
}
