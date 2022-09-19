package com.bikeapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.bikeapp.model.Bike;
import com.bikeapp.repository.IBikeRepository;

@Service
public class BikeServiceImpl implements IBikeService{

	@Override
	public List<Bike> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByName(String name)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBrand(String brand)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByPrice(double price)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByModelNumber(Integer modelNumber){
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
