package com.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;
@Controller
public class Index {

  @RequestMapping(value="/", method=GET)
  public String Index() {
    System.out.println("calling GET Index method");
    return "index";
  }
}
