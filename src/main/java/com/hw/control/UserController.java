package com.hw.control;

import com.hw.pojo.User;
import com.hw.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @param:
 * @Author: Administrator
 * @CreateTime: 2019-05-17 19:29
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("init")
    @ResponseBody
    public Object init(@RequestParam String name){
        System.out.println(name);
        List<User> all = userService.findAll();
        System.out.println("登陆成功");
        return all;
    }

    @RequestMapping("loads")
    @ResponseBody
    //返回值是Object的方法，必须配置@ResponseBody。默认响应的值是JSON格式
    public Object load(){
        return "true";
    }

    //返回值与同一个控制层@RequestMapping("loads")注解相同，则会优先访问执行被标注的方法
    //返回值是String的方法，返回字符串默认为页面，根据配置文件寻找对应的页面
    @RequestMapping("reload")
    public String reload(@RequestBody User user){
        System.out.println(user);
        return "load";
    }

    @RequestMapping("delete")
    @ResponseBody
    public Object delete(@RequestBody User user){
        System.out.println("delte");
        Integer delete = userService.delete(user);
        System.out.println(delete);
        return delete;
    }
}
