package com.linjing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//通过@Controller注解的类，会被spring接管。
//这个注解的类的所有方法，如果返回值是String, 且有具体页面可以跳转，那么就会被视图解析器解析。
public class ControllerDemo02 {

    @RequestMapping("/t2")
    public String test1(Model model) { //Model是个简化版的ModelAndView
        model.addAttribute("msg", "ControllerTest2");
        return "test"; //WEB-INF/jsp/test.jsp
    }

    @RequestMapping("/t3")
    public String test3(Model model) { //Model是个简化版的ModelAndView
        model.addAttribute("msg", "ControllerTest2");
        return "test"; //WEB-INF/jsp/test.jsp
    }
}
