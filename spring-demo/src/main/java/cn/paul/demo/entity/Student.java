package cn.paul.demo.entity;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 学生实体类，基于注解的 bean 的定义（不需要提供 setter 方法）
 * @date 2023/11/30
 */
@Component("student")
public class Student {
    @Value("张三")
    private String name;
    @Resource
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
