package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/14 10:20
 */
@Controller
public class ControllerTest01 {

  //  @GetMapping("/add/{a}/{b}")
  //  public String test01(@PathVariable int a, @PathVariable int b, Model model) {
  //    int res = a + b;
  //
  //    model.addAttribute("msg", "结果 " + res);
  //    return "test";
  //  }
  //
  //  @GetMapping("/add")
  //  public String test02() {
  //
  //    return "redirect:index.jsp";
  //  }

  @RequestMapping("/user/n")
  public String test03(String name, Model model) {
    System.out.println(name);

    model.addAttribute("msg", name);
    return "test";
  }

}
