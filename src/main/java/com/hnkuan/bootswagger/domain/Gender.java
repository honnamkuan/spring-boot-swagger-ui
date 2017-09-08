package com.hnkuan.bootswagger.domain;

import lombok.Getter;

/**
 * Created on 8/9/2017
 *
 * @author honnamkuan
 */
public enum Gender {

  Male(1, "Male"), Female(2, "Female");

  @Getter
  private int id;

  @Getter
  private String name;

  Gender(int id, String name) {
    this.id = id;
    this.name = name;
  }

}
