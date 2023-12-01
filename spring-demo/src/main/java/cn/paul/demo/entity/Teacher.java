package cn.paul.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 老师实体类，基于注解的 bean 的定义（不需要提供 setter 方法）
 * Spring 为此提供了四个注解，这些注解的作用与上面的 XML 定义的 bean 效果一致，在于将组件交给 Spring 容器管理，组件的名称默认为类名（首字母变小写），也可以自己修改。
 *      @Component: 当对组件的层次难以定位的时候使用这个注解
 *      @Controller: 表示控制层的组件@Service: 表示业务逻辑层的组件
 *      @Service: 表示业务逻辑层的组件
 *      @Repository: 表示数据访问层的组件
 * @date 2023/11/30
 */
@Component("teacher")
public class Teacher {
    @Value("李四")
    private String name;

    public String getName() {
        return name;
    }
}
