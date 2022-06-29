package com.rental.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.car.dto.CarRequestDto;
import com.rental.car.dto.CarResponseDto;
import com.rental.car.model.Car;
import com.rental.car.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository repository;
	
	public CarResponseDto create(CarRequestDto newCar) {
		String manufacturer = newCar.getManufacturer().toLowerCase();
		String model = newCar.getModel().toLowerCase();
		Car car = repository.save(new Car(manufacturer, model));
		CarResponseDto parse = new CarResponseDto(car.getId(), car.getManufacturer(), car.getModel(), car.getIsAvailable());
		return parse;
	}
	
	public List<CarResponseDto> listAll() {
		List<Car> allCars = repository.findAll();
		List<CarResponseDto> list = new ArrayList<CarResponseDto>();
		for(Car car : allCars) {
			CarResponseDto parse = new CarResponseDto(car.getId(), car.getManufacturer(), car.getModel(), car.getIsAvailable());
			list.add(parse);
		}
		return list;
	}
}
