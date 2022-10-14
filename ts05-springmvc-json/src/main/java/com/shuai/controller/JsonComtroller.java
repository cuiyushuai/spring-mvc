package com.shuai.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shuai.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Admin
 * @date 2022/10/14 13:22
 */

@RestController
public class JsonComtroller {

  @GetMapping("/json01")
  public String json01() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();
    List<User> list = new ArrayList<>();

    User user = new User(1, "战士", 19);
    User user1 = new User(1, "战士1", 19);
    User user2 = new User(1, "战士2", 19);
    User user3 = new User(1, "战士3", 19);
    list.add(user);
    list.add(user1);
    list.add(user2);
    list.add(user3);
    return mapper.writeValueAsString(list);
  }

  @RequestMapping("/j2")
  public String json2() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();
    List<User> list = new ArrayList<>();

    User user = new User(1, "战士", 19);
    User user1 = new User(1, "战士1", 19);
    User user2 = new User(1, "战士2", 19);
    User user3 = new User(1, "战士3", 19);
    list.add(user);
    list.add(user1);
    list.add(user2);
    list.add(user3);

    System.out.println(JSON.toJSON(list));
    System.out.println(JSON.toJSONString(list));
 
    return JSON.toJSONString(user);
  }

}
