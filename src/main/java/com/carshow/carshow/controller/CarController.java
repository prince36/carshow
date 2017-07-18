package com.carshow.carshow.controller;

import com.carshow.carshow.model.Car;
import com.carshow.carshow.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(value = "/home1", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model, Pageable pageable) {

        //model.put("car1", carRepository.findAll(pageable));
        System.out.println("liczbax: "+carRepository.findAll(pageable).getTotalElements());
        return "home";
    }
    //DASHBOARD
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Map<String, Object> model) {

        return "dashboard";
    }


    //CARS
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeCars(Map<String, Object> model) {

        return "dashboard";
    }


    //PAGE CAR
    @RequestMapping(value = "/{idcars}", method = RequestMethod.GET)
    public String carPage(Map<String, Object> model, @PathVariable("idcars") Long id) {
        model.put("car1", carRepository.findOne(id));
        return "carPage";
    }

}