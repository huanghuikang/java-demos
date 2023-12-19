package cn.paul.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户实体类
 *      @Date //lombok中的注解，自动生成getter&setter方法
 * @date 2023/12/11
 */


@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String sex;
    private Long age;
    private String email;
}
