package springboot07datamybatis.student.dao;

import org.apache.ibatis.annotations.Param;
import springboot07datamybatis.student.pojo.User;

import java.util.List;

/**
 * @program:spring-boot-07-data-mybatis
 * @description:dao
 * @author:Mr.Lzl
 * @create:2019-03-27 17:02
 **/
public interface UserMapper {
    /*查询所有用户的方法*/
    List<User> getUserList(@Param("user") User user);

    //*新增用户*//*
    int insertUser( @Param("user") User user);

    //*修改用户*//*
    int updateUser(@Param("user") User user);

    //*删除用户*//*
    int deleteUser(@Param("user") User user);


}
