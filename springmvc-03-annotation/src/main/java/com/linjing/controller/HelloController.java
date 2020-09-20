package com.linjing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @RequestMapping("/hello") public class HelloController {

    //真实访问地址 : http://localhost:8080/hello/h1
    @RequestMapping("/h1") public String hello(Model model) {

        //封装数据
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", "Hello, SpringMVCAnnotation!");

        //会被视图解析器处理
        //web-inf/jsp/hello.jsp
        return "hello";
    }

    @RequestMapping("/hello2") public String hello2(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello, SpringMVCAnnotation2!");
        return "hello"; //会被视图解析器处理，
    }

    @RequestMapping("/hello3") public String hello3(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello, SpringMVCAnnotation3!");
        return "hello"; //会被视图解析器处理，
    }

}
