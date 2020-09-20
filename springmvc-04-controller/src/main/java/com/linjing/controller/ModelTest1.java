package com.linjing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller public class ModelTest1 {

    //不用视图解析器ModelAndView也能做
    //    @RequestMapping("m1/t1")
    //    public String test(HttpServletRequest req, HttpServletResponse resp) {
    //        HttpSession session = req.getSession();
    //        System.out.println(session.getId());
    //        return "test";
    //    }

    @RequestMapping("m1/t2")
    public String test1(Model model) {
        model.addAttribute("msg", "modelTest1");
        //转发(默认): forward:/index.jsp, 跳转后url不变
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("m1/t3")
    public String test2(Model model) {
        model.addAttribute("msg", "modelTest1");
        //可以重定向：redirect:/index.jsp
        return "redirect:/index.jsp";
    }
}
