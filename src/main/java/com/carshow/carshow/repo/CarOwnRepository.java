package com.carshow.carshow.repo;

import com.carshow.carshow.model.Car;
import org.springframework.data.repository.Repository;


import java.util.List;

public interface CarOwnRepository extends Repository<Car,Long> {
    //List<Car> findBybrand(String brand);
    //List<Car> findByModel(String name);
    //List<Car> findByPrice(int price);
    //List<Car> findByModelAndFuel(String name, String fuel);
}
