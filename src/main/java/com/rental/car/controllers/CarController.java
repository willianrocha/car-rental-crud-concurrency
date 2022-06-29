package com.rental.car.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rental.car.dto.CarRequestDto;
import com.rental.car.dto.CarResponseDto;
import com.rental.car.model.Car;
import com.rental.car.repository.CarRepository;
import com.rental.car.service.CarService;

@RestController()
@RequestMapping(value = "/car")
public class CarController {
	private final CarRepository repository;
	@Autowired
	private final CarService service;
	
	CarController(CarRepository repository) {
		this.repository = repository;
		this.service = new CarService();
	}
	
	@PostMapping()
	ResponseEntity<CarResponseDto> addCar(@RequestBody CarRequestDto newCar) {
		CarResponseDto createdCar = service.create(newCar);
		return new ResponseEntity<CarResponseDto>(createdCar, HttpStatus.CREATED);
	}
	
	@GetMapping()
	ResponseEntity<List<CarResponseDto>> listCars() {
		List<CarResponseDto>  allCars = service.listAll();
		return new ResponseEntity<List<CarResponseDto>>(allCars, HttpStatus.OK);
	}
	
}
