package com.bikeapp.repository;

import java.util.List;

import com.bikeapp.model.Bike;

public interface IBikeRepository {
	
	List<Bike> findAll();
	List<Bike> findByName(String name);
	List<Bike> findByBrand(String brand);
	List<Bike> findByPrice(double price);
	List<Bike> findByModelNumber(Integer modelNumber);

}
