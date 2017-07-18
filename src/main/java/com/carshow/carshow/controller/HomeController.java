package com.carshow.carshow.controller;

import com.carshow.carshow.model.Car;
import com.carshow.carshow.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    private CarRepository carRepository;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model, Pageable pageable) {

        //model.put("car1", carRepository.findAll(pageable));
        System.out.println("liczbax: "+carRepository.findAll(pageable).getTotalElements());
        return "home";
    }

    @RequestMapping(value = "/home/{idcars}", method = RequestMethod.GET)
    public String carPage(Map<String, Object> model, @PathVariable("idcars") Long id) {

        model.put("car1", carRepository.findOne(id));
        return "carPage";
    }


    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "home";
    }
    @RequestMapping("/w")
    public String welcome(ModelMap map) {
        map.put("currentDate", new Date());
        return "home";
    }

    @RequestMapping("/ww")
    public String home(){
        return "Hello World!";
    }

}
