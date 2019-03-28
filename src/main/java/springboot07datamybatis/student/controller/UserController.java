package springboot07datamybatis.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springboot07datamybatis.student.pojo.User;
import springboot07datamybatis.student.services.UserServices;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @program:spring-boot-07-data-mybatis
 * @description:controller
 * @author:Mr.Lzl
 * @create:2019-03-27 17:15
 **/
@Controller
public class UserController {
    @Resource
    UserServices userServices;

    @GetMapping("/user/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/user/dologin")
    public String doLogin(User user, HttpSession session) {
        if (userServices.getUserList(user).size() != 0) {
            return "redirect:/user/index";
        }
        session.setAttribute("manage", "不存在账号这是我的测试分支");
        return "redirect:/user/login";
    }

    @GetMapping("/user/index")
    public String getIndex(HttpSession session) {
        session.setAttribute("userLists", userServices.getUserList(new User()));
        return "index";
    }

    @GetMapping("/user/inertInfo")
    public String getInsertInfo() {
        return "insertInfo";
    }

    @PostMapping("/user/insertdo")
    public String insertdo(User user) {
        userServices.insertUser(user);
        return "index";
    }
}
