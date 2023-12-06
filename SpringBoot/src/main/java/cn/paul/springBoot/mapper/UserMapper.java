package cn.paul.springBoot.mapper;

import cn.paul.springBoot.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description Mapper层注解 @Reponsitory 和 @Mapper
 *      @Mapper: 这个注解一般使用在Dao层接口上，相当于一个mapper.xml文件，它的作用就是将接口生成一个动态代理类。加入了@Mapper注解，目的就是为了不再写mapper映射文件。这个注解就是用来映射mapper.xml文件的。
 *      @Repository ：@Repository的作用与@Controller，@Service的作用都是把对象交给Spring管理。@Repository是标注在Dao层接口上，作用是将接口的一个实现类交给Spring管理。
 * @date 2023/12/2
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 查找所有用户列表
     * @return
     */
    List<User> queryUserList();

    /**
     * 条件查找用户
     * @param id
     * @return
     */

    User queryUserById(Integer id);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    void addUser(User user);

    /**
     * 修改用户
     * @param id
     * */
    void updateUser(Integer id);

    /**
     * 删除用户
     * @param id
     * */
    void deleteUserById(Integer id);
}
