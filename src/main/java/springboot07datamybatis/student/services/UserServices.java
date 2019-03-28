package springboot07datamybatis.student.services;

import springboot07datamybatis.student.pojo.User;

import java.util.List;

public interface UserServices {
    /*查询所有用户的方法*/
    List<User> getUserList(User user);
    /*新增用户*/
    int insertUser(User user);
    /*修改用户*/
    int updateUser(User user);
    /*删除用户*/
    int deleteUser( User user);
}
