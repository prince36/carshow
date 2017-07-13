package com.carshow.carshow.controller;

import com.carshow.carshow.model.Car;
import com.carshow.carshow.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;
    //@Autowired
    //private CarService carService;

    @RequestMapping(value = "/listPageable", method = RequestMethod.GET)
    Page<Car> employeesPageable(Pageable pageable) {
        return carRepository.findAll(pageable);

    }

    @RequestMapping(value = "/{idcars}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Car getCar(@PathVariable("idcars") Long id) {
        return carRepository.findOne(id);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getCarsAll() {
        return carRepository.findAll();
    }

    /*
    @GetMapping("article/{id}")
    public ResponseEntity<Car> getArticleById(@PathVariable("id") long id) {
        Car article = carService.getCar(id);
        return new ResponseEntity<Car>(article, HttpStatus.OK);
    }*/
}