package com.aws.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {

  @GetMapping("/")
  public String welcome() {

    return "Deployed in AWS..";
  }
}
