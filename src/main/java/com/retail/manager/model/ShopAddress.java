package com.retail.manager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShopAddress {
  private int number;
  private String postCode;
}
