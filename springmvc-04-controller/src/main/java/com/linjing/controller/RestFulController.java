package com.linjing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller public class RestFulController {

    //原来：http://localhost:8080/add?a=1&b=2
    //现在RESTFul: http://localhost:8080/add/1/2 (简洁，高效（缓存），安全！！！)


    //    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    //在Spring MVC中可以使用@PathVariable注解，让方法参数的值绑定到一个URI模板变量上
    public String test1(Model model, @PathVariable int a, @PathVariable int b) {
        int res = a + b;
        model.addAttribute("msg", "结果get为" + res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(Model model, @PathVariable int a, @PathVariable int b) {
        int res = a + b;
        model.addAttribute("msg", "结果post为" + res);
        return "test";
    }

    //url复用
}
