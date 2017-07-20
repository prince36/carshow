package com.carshow.carshow.repo;

import com.carshow.carshow.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c WHERE c.brand = ?1 ORDER BY c.model asc, c.model_version asc")
    List<Car> findBybrand(String brand);

    @Query("SELECT DISTINCT c.brand  FROM Car c ORDER BY c.brand asc")
    List<String> findAllBrand();
}
