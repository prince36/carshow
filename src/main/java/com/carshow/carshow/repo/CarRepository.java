package com.carshow.carshow.repo;

import com.carshow.carshow.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<Car, Long>, PagingAndSortingRepository<Car,Long> {

}
