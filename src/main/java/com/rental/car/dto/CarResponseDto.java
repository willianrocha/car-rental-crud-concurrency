package com.rental.car.dto;

public class CarResponseDto {
	private Long id;
	private String manufacturer;
	private String model;
	private Boolean isAvailable;
	
	public CarResponseDto(Long id, String manufacturer, String model, Boolean isAvailable) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.isAvailable = isAvailable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
