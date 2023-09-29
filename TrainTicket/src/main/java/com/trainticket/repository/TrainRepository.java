package com.trainticket.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trainticket.entity.Train;

public interface TrainRepository extends CrudRepository<Train, Integer> {

	public List<Train> findAll();
	
	public Train findById(int id);
	
	
}
