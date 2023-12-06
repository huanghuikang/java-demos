package cn.paul.springBoot.service;

import cn.paul.springBoot.dao.User;
import cn.paul.springBoot.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户服务类
 *      @Autowired 和 @Resource 注解都是作为bean对象注入的时候使用的
 *      区别：
 *          @Autowired 注解是Spring提供的，而 @Resource 注解是J2EE本身提供的。
 *          @Autowird 注解默认通过byType方式注入，而 @Resource注解默认通过byName方式注入。
 *          @Autowired 注解注入的对象需要在IOC容器中存在，否则需要加上属性required=false，表示忽略当前要注入的bean，如果有直接注入，没有跳过，不会报错
 * @date 2023/12/2
 */
@Service
public class UserService   {
    @Autowired
    private UserMapper userMapper;
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }

    public User queryUserById(Integer id) {
        User user = userMapper.queryUserById(id);
        return user;
    }

    public String addUser(User user) {
        userMapper.addUser(user);
        return "插入成功";
    }

    public String updateUser(Integer id) {
        userMapper.updateUser(id);
        return "修改成功";
    }

    public String deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
        return "删除成功";
    }

}
