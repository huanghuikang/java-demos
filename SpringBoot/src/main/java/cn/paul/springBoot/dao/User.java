package cn.paul.springBoot.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户实体类
 *  引入lombok，lombok 是什么，它是一个工具类库，可以用简单的注解形式来简化代码，提高开发效率。
 *      @Data 注解的主要作用是提高代码的简洁，使用这个注解可以省去代码中大量的get()、 set()、 toString()等方法；
 *      @NoArgsConstructor 在类上使用，这个注解可以生成无参构造方法
 *      @AllArgsConstructor 在类上使用，这个注解可以生成全参构造函数，且默认不生成无参构造函数。
 * @date 2023/12/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer id;
    private String sex;

}
