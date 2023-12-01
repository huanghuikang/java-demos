package cn.paul.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 基于 java 类的 ben 定义（需要提供setter方法）
 * @date 2023/11/30
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public Children children(){
        Children children = new Children();
        children.setName("zhangSan");
        children.setParents(parents());
        return children;
    }
    @Bean
    public Parents parents(){
        Parents parents = new Parents();
        parents.setName("liSi");
        return parents;
    }

}
