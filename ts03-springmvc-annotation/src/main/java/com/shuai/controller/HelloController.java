package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/13 17:20
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping("/h1")
  public String hello(Model model) {

    model.addAttribute("msg", "Hello,SpringMVC");

    return "hello";
  }

}
