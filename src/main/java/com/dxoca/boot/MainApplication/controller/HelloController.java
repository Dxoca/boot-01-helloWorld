package com.dxoca.boot.MainApplication.controller;

import com.dxoca.boot.MainApplication.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 包括了以下两个注解
 *
 * @ResponesBody
 * @Controller //控制器
 */
//控制器 专门来处理请求
@RestController
public class HelloController {
  /**
   * 映射请求
   *
   * @return
   */
  @RequestMapping("/hello")
  public String handle01() {
    return "Hello, Spring Boot2!";
  }

  @Autowired//自动注入
      Car car;

  @RequestMapping("/car")
  public Car car() {
    return car;
  }
}
