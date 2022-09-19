package com.bikeapp.service;

import java.util.List;
import com.bikeapp.model.Bike;

public interface IBikeService {
	
	List<Bike> getAll();
	List<Bike> getByName(String name);
	List<Bike> getByBrand(String brand);
	List<Bike> getByPrice(double price);
	List<Bike> getByModelNumber(Integer modelNumber);

}
