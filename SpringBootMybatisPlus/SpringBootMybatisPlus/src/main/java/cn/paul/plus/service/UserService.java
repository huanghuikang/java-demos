package cn.paul.plus.service;

import cn.paul.plus.entity.User;
import cn.paul.plus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Paul Huang
 * @Purpose 目的
 * @Created 2023/12/18
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     * */
    public boolean addUser(User user){
        return userMapper.insert(user) == 1;
    }

    /**
     * 根据ID删除用户
     * */
    public boolean deleteUserById(Long id){
        return userMapper.deleteById(id) == 1;
    }

    /**
     * 更新用户信息
     * */
    public boolean updateUser(User user){
        return userMapper.updateById(user) == 1;
    }

    /**
     * 查询所有用户信息
     * */
    public List<User> getUsers(){
        return userMapper.selectList(null);
    }

    /**
     * 根据ID查询用户
     * */
    public User getUserById(Long id){
        return userMapper.selectById(id);
    }
}
