package com.retail.manager.service;

import com.retail.manager.model.ShopAddress;

public interface GeocodingService {
  ShopAddress retrieveGeocode(ShopAddress shopAddress);
}
