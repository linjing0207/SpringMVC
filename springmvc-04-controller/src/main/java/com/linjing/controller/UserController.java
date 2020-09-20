package com.linjing.controller;

import com.linjing.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller @RequestMapping("/user") public class UserController {

    //localhost:8080/t1?username=xxx
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name,
        Model model) { //@RequestParam("username") 表示要从前端接收，且得是username。
        //1. 接受前端参数
        System.out.println("接收到前端的参数为：" + name);
        //2. 将返回结果传递给前端
        model.addAttribute("msg", name);
        //3. 视图跳转
        return "test";
    }

    /*
    1. 接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
    2. 假设传递的是一个对象user，匹配User对象中的字段名，如果名字一致则OK，否则匹配不到
    */

    //localhost:8080/user/t2?id=1&name=lulu&age=5
    //前端接收的是一个对象： id, name, age
    @GetMapping("/t2")
    public String test2(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", user.getName());
        return "test";
    }

    //Model继承ModelMap, ModelMap继承了LinkedHashMap
    //Model精简版，大部分情况使用。
    public String test3(ModelMap map) {
        map.addAttribute("msg", "hello");
        return "test";
    }
}
