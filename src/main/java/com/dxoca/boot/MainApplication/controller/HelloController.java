package com.dxoca.boot.MainApplication.controller;

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
}
