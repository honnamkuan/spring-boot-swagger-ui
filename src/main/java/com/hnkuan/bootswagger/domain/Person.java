package com.hnkuan.bootswagger.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on 8/9/2017
 *
 * @author honnamkuan
 */
@Builder
public class Person {

  @Getter
  private final String name;

  @Getter
  @Setter
  private int age;

  @Getter
  @Setter
  private Gender gender;
}
