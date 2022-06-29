package com.rental.car.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private Long id;
	
	@Column()
	private String manufacturer;
	
	@Column()
	private String model;
	
	@Column(name="is_available", columnDefinition = "boolean default true")
	private Boolean isAvailable;

	public Car(){}
	
	public Car(String manufacturer, String model) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.isAvailable = true;
	}

	public Long getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}
}
