package com.retail.manager.service;

import com.retail.manager.service.impl.ShopServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class ShopServiceTests {

  ShopService shopService;

  @Before
  public void init() {
    shopService = new ShopServiceImpl();
  }

  @Test
  public void addShopTest() {

    shopService.addShop("shop1", 141, "HA6 1RF");
  }
}
