package cn.paul.plus.mapper;

import cn.paul.plus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project SpringBoot
 * @description 创建用户映射接口,直接继承 BaseMapper，这是 mybatis-plus 封装好的类。
 *      @Mapper //表明这是一个Mapper，也可以在启动类上加上包扫描
 *
 *      //继承BaseMapper可以省略xml的编写
 * @date 2023/12/11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
