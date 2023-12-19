package cn.paul.plus.controller;

import cn.paul.plus.entity.User;
import cn.paul.plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户控制类
 * @date 2023/12/11
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("findList")
    @ResponseBody
    public void findList(){
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(),"");
        userList.forEach(System.out::println);
    }

    @GetMapping("findAllList")
    @ResponseBody
    public List<User> findAllList(){
        return userMapper.selectList(null);
    }

    @GetMapping("findOne")
    @ResponseBody
    public User findOne(Long id){
        return userMapper.selectById(id);
    }

    @GetMapping("userInsert")
    @ResponseBody
    public int userInsert(User user){
//        User user = new User();
        return userMapper.insert(user);
    }

    @GetMapping("userUpdate")
    @ResponseBody
    public int userUpdate(User user){
        return userMapper.updateById(user);
    }

    @GetMapping("userDeleteById")
    @ResponseBody
    public int userDeleteById(Long id){
        return userMapper.deleteById(id);
    }
}
