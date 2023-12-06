package cn.paul.springBoot.controller;

import cn.paul.springBoot.dao.User;
import cn.paul.springBoot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 用户控制类
 * @date 2023/12/2
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/queryUserList")
    @ResponseBody
    public List<User> queryUserList(){
        return userService.queryUserList();
    }

    /**
     * http://localhost:8080/user/queryUserById?id=1
     * @param id
     * @return
     */
    @GetMapping("/queryUserById")
    @ResponseBody
    public User queryUserById(Integer id){
        return userService.queryUserById(id);
    }

    /**
     * http://localhost:8080/user/addUser?name=zhangsan&id=2&sex=a
     * @param user
     * @return
     */
    @GetMapping("/addUser")
    @ResponseBody
    public String addUser(User user){
        return userService.addUser(user);
    }

    @GetMapping("/updateUser")
    @ResponseBody
    public String updateUser(Integer id){
        return userService.updateUser(id);
    }

    /**
     * http://localhost:8080/user/deleteUserById?id=2
     * @param id
     * @return
     */
    @GetMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(Integer id){
        return userService.deleteUserById(id);
    }


    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "sfjalfjallf";
    }
}
