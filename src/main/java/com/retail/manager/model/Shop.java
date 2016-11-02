package com.retail.manager.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Shop {
  @Id
  private Long id;
  private String shopName;
  private ShopAddress shopAddress;
}
