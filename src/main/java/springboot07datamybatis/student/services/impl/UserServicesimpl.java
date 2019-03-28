package springboot07datamybatis.student.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot07datamybatis.student.dao.UserMapper;
import springboot07datamybatis.student.pojo.User;
import springboot07datamybatis.student.services.UserServices;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program:spring-boot-07-data-mybatis
 * @description:imp
 * @author:Mr.Lzl
 * @create:2019-03-27 17:12
 **/
@Service(value ="userServices" )
public class UserServicesimpl  implements UserServices {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getUserList(User user) {
        return userMapper.getUserList(user);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
