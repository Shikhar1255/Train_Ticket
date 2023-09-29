package com.trainticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainticket.entity.Train;
import com.trainticket.repository.TrainRepository;

@Service
public class TrainService {

	@Autowired
	private TrainRepository trainRepository;
	
	// Get all method
	
	public List<Train>  getAllTrain(){
		List<Train> list=(List<Train>)trainRepository.findAll();
		return list;
		
	}
	
	// Get method by id
	
	public Train getTrainById(int id) {
		Train train= null;
		train=this.trainRepository.findById(id);
		return train;
		
	}
	
	// Post method
	
	public Train addTrain(Train t) {
		Train result=trainRepository.save(t);
		return result;
	}
	
	// Delete by id method
	
	public void deleteById(int tid) {
		trainRepository.deleteById(tid);
	}
	
	
	
}
