package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Admin
 * @date 2022/10/15 15:38
 */
@Controller
public class TestController {

  @RequestMapping("/a1")
  @ResponseBody
  public String a1(final String name, String pwd) {
    String msg = "";
    if ("admin".equals(name)) {
      msg = "ok";
    } else {
      msg = "账户有问题；";
      return msg;
    }
    if ("123456".equals(pwd)) {
      msg = "ok";
    } else {
      msg = "密码有问题；";
      return msg;
    }

    return msg;
  }
}
