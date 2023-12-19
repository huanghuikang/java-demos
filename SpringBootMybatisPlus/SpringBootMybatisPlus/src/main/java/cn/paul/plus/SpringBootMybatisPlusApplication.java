package cn.paul.plus;
/**
 * @author PaulHuang
 * 配置 MapperScan 注解
 * @MapperScan和dao层添加@Mapper注解意思一样,扫描mapper接口所在的包
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "cn.paul.plus.mapper")
public class SpringBootMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
    }

}
