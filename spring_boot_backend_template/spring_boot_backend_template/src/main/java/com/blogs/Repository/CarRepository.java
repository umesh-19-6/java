package com.blogs.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.Entity.Car;
public interface CarRepository extends JpaRepository<Car,Integer> {

}
