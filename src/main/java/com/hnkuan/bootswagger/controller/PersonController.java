package com.hnkuan.bootswagger.controller;

import com.hnkuan.bootswagger.domain.Gender;
import com.hnkuan.bootswagger.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 8/9/2017
 *
 * @author honnamkuan
 */
@RestController
@RequestMapping("/person")
public class PersonController {

  @GetMapping
  public Person get() {
    return Person.builder().name("Uncle Kwan").age(54).gender(Gender.Male).build();
  }
}
