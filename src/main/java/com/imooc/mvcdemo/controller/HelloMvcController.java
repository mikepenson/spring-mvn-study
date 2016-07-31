package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mike on 2016/7/31.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    @RequestMapping("/mvc")
    public String helloMvc(){
        //localhost:8080/hello/mvc/home.jsp
        return "home";
    }
}
