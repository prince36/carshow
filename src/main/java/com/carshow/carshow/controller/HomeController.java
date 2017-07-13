package com.carshow.carshow.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;


@Controller
public class HomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    //@GetMapping("/home")
    @RequestMapping("/home")
    public String welcome(Map<String, Object> model) {
        //model.put("time", new Date());
        //model.put("message", this.message);
        return "home";
    }
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "home";
    }

}
