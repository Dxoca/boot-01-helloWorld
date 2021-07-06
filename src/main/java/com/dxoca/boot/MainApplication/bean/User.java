package com.dxoca.boot.MainApplication.bean;

public class User {
  private String User;
  private Integer age;
  private Pet pet;

  @Override
  public String toString() {
    return "User{" +
        "User='" + User + '\'' +
        ", age=" + age +
        ", pet=" + pet +
        '}';
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public User() {

  }

  public User(String user, Integer age) {
    User = user;
    this.age = age;
  }

  public String getUser() {
    return User;
  }

  public void setUser(String user) {
    User = user;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

}
