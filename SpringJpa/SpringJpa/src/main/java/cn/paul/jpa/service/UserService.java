package cn.paul.jpa.service;

import cn.paul.jpa.entity.User;
import cn.paul.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 实现增删改查类
 * @date 2023/12/6
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public User findUser(Long id) {
        return userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteAllUser(){
        userRepository.deleteAll();
    }
}
