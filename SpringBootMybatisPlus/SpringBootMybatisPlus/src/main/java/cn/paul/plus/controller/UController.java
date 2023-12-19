package cn.paul.plus.controller;

import cn.paul.plus.entity.User;
import cn.paul.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Paul Huang
 * @Purpose 目的
 * @Created 2023/12/18
 */
@Controller
@RequestMapping("/user")
public class UController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户
     *
     * */
    @GetMapping("/add")
    @ResponseBody
    public boolean addUser(User user){
        return userService.addUser(user);
    }

    /**
     * 查询所有用户
     * */
    @GetMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.getUsers();
    }

    /**
     * 根据ID查找用户
     * */
    @GetMapping("findOneById")
    @ResponseBody
    public User findOneById(Long id){
        return userService.getUserById(id);
    }
    /**
     * 根据ID删除用户
     * */
    @GetMapping("deleteUser")
    @ResponseBody
    public boolean deleteUser(Long id){
        return userService.deleteUserById(id);
    }
    /**
     * 根据ID更新用户
     * */
    @GetMapping("updateUser")
    @ResponseBody
    public boolean updateUser(User user){
        return userService.updateUser(user);
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
