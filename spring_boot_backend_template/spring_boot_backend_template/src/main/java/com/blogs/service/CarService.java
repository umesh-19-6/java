package com.blogs.service;

import java.util.List;
import java.util.Optional;

import com.blogs.Entity.Car;



public interface CarService {
	 
	 public List<Car> getAllCars();
	 public Car createCar(Car car);
	 public boolean deleteCar(int id);
	 public Optional<Car> getCarById(int id);
	 public Optional<Car> updateCar(int id, Car car);

}
