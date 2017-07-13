package com.carshow.carshow.service;

import com.carshow.carshow.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarService {/*
    public void addCar(Car car);
    public void updateCar(Car car);
    public Car getCar(long id);
    public Car getCar(String name);
    public void deleteCar(int id);
    public List<Car> getCars();*/

    Page<Car> listAllByPage(Car pageable);

    Page<Car> listAllByPage(Pageable pageable);
}
