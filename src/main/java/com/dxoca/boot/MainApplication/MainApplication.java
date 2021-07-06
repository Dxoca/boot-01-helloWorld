package com.dxoca.boot.MainApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * maven 打jar包 lifeCycle（clean package）
 */

/**
 * 主程序类 素有启动的入口
 *
 * @SpringBootApplication： 告诉sp这是一个sp应用
 * <p>
 * scanBasePackages 改变扫描路径
 * 或者 ComponentScan来指定路径
 */
@SpringBootApplication(scanBasePackages = "com.dxoca.boot")//扩大默认扫描范围
public class MainApplication {
  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);
  }
}

