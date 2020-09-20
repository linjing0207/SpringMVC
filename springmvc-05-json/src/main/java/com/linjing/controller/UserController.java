package com.linjing.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linjing.pojo.User;
import com.linjing.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@RestController  //如果用这个注释标记类，类里面的所有方法只会返回字符串，不走视图解析器
@Controller public class UserController {

    //后端给前端传递一个json格式的数据

    //    @RequestMapping(value = "/json1", produces = "application/json;character=utf-8")
    @RequestMapping("json1")
    @ResponseBody //配合@controller使用，它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //jackson包
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("小猪佩奇", 5, "女");

        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);

        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }

    @RequestMapping("json2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("小猪佩奇1", 5, "女");
        User user2 = new User("小猪佩奇2", 5, "女");
        User user3 = new User("小猪佩奇3", 5, "女");
        User user4 = new User("小猪佩奇4", 5, "女");
        User user5 = new User("小猪佩奇5", 5, "女");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("json3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        return JsonUtils.getJson(new Date());
    }

    @RequestMapping("json4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("小猪佩奇1", 5, "女");
        User user2 = new User("小猪佩奇2", 5, "女");
        User user3 = new User("小猪佩奇3", 5, "女");
        User user4 = new User("小猪佩奇4", 5, "女");
        User user5 = new User("小猪佩奇5", 5, "女");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return JSON.toJSONString(userList);
    }

}
