package cn.paul.jpa.repository;

import cn.paul.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 定义Repository接口
 * @date 2023/12/8
 */
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();
}
