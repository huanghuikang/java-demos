package cn.paul.jpa.controller;

import cn.paul.jpa.entity.User;
import cn.paul.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户控制类
 * @date 2023/12/6
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    @ResponseBody
    public List<User> findAllUser(User user){

        return userService.findAll();
    }

    @GetMapping("find")
    @ResponseBody
    public User findUser(Long id){

        return userService.findUser(id);
    }

    @GetMapping("add")
    @ResponseBody
    public User addUser(String name,String sex){
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        return userService.saveUser(user);
    }

    @GetMapping("update")
    @ResponseBody
    public User updateUser(String name,Long id,String sex){
        User user = userService.findUser(id);
        user.setName(name);
        user.setSex(sex);
        userService.updateUser(user);
        return user;
    }
    @GetMapping("delete")
    @ResponseBody
    public String deleteUser(Long id){
        userService.deleteUser(id);
        return "删除成功";
    }
    @GetMapping("deleteAll")
    @ResponseBody
    public String deleteAllUser(){
        userService.deleteAllUser();
        return "删除所有用户成功";
    }
    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "AAAA";
    }

}
