package com.blogs;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.Entity.Car;
//import com.Repository.CarRepository;

@SpringBootApplication
public class DemoApplication {

	
		//@Autowired
	   // private CarRepository carRepository;

	    public static void main(String[] args) {
	    	SpringApplication.run(DemoApplication.class, args);
	    }

//	    @Override
//	    public void run(DemoApplication.class, args) throws Exception {
//	        // Sample data for demonstration
//	        carRepository.save(new Car(1, "Toyota Camry", 4, 32.0));
//	        carRepository.save(new Car(2, "Honda Civic", 4, 35.0));
//	        carRepository.save(new Car(3, "Ford Mustang", 4, 28.0));
//	    }
		//SpringApplication.run(DemoApplication.class, args);
	}


