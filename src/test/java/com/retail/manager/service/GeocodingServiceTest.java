package com.retail.manager.service;

import com.retail.manager.model.ShopAddress;
import com.retail.manager.service.impl.GeocodingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class GeocodingServiceTest {

  GeocodingService geocodingService;

  @Before
  public void init() {
    geocodingService = new GeocodingServiceImpl();
  }

  @Test
  public void retrieveGeocodeTest() {
    geocodingService.retrieveGeocode(new ShopAddress(141, "HA6 1RF"));
  }
}
