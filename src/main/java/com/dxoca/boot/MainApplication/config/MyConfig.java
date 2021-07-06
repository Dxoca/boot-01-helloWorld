package com.dxoca.boot.MainApplication.config;

import com.dxoca.boot.MainApplication.bean.Pet;
import com.dxoca.boot.MainApplication.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * configuration 代理bean  P8
 * full（true ）模式和lite(false)模式
 * proxyBeanMethods true(默认)  默认保证每个实例都是单实例 外面调用 都会从容器中调用
 *                  false 不会在容器中保存代理对象 每一次调用都是新的对象 【组件依赖】 还能提高加载速度
 *
 * Spring AOP
 */
@Configuration(proxyBeanMethods = false)//告诉springboot是一个配置类 @Documented @Component(容器组件)

public class MyConfig {
  @Bean //给容器中添加组件以方法名作为组件的id 返回类型是组件类型，返回的值 是组件在容器中的实例
  public User user01() {
    return new User("张三", 12);
  }

  @Bean("tom")
  public Pet tomcatPet() {
    return new Pet("小白");
  }
}
