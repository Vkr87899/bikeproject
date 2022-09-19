package com.bikeapp.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bikeapp.model.Bike;

@Repository
public class BikeRepositoryImpl implements IBikeRepository{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Bike> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> findByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> findByModelNumber(Integer modelNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
