package cn.paul.plus;

import cn.paul.plus.entity.User;
import cn.paul.plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SpringBootMatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(),"");
        userList.forEach(System.out::println);

    }

}
