package com.linjing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @RequestMapping("admin")  //指定类路径
public class ControllerDemo03 {

    @RequestMapping("t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ControllerTest3");
        return "test";
    }

}
