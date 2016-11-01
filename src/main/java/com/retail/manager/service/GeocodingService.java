package com.retail.manager.service;

import com.retail.manager.model.Shop;

public interface GeocodingService {
  Shop.ShopAddress getShopAddress(int number, String postCode);
}
