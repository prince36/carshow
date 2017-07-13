package com.carshow.carshow.service;

import com.carshow.carshow.dao.CarDAO;
import com.carshow.carshow.model.Car;
import com.carshow.carshow.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public Page<Car> listAllByPage(Car pageable) {
        return null;
    }

    @Override
    public Page<Car> listAllByPage(Pageable pageable) {
        return carRepository.findAll(pageable);
    }
/*
    @Autowired
    private CarDAO carDAO;


    @Override
    public void addCar(Car car) {

    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public Car getCar(long id) {
        return carDAO.getCar(id);
    }

    @Override
    public Car getCar(String name) {
        return null;
    }

    @Override
    public void deleteCar(int id) {

    }

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }*/
}
