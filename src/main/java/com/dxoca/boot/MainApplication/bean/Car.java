package com.dxoca.boot.MainApplication.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//只有容器里的组件才会拥有sp的强大功能
@ConfigurationProperties(prefix = "mycar")//绑定配置文件 mycar前缀相关 核心配置文件
public class Car {
  private String brand;
  private Integer price;

  public Car() {//没有无参构造函数会报错
  }

  public Car(String brand, Integer price) {
    this.brand = brand;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", price=" + price +
        '}';
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

}
