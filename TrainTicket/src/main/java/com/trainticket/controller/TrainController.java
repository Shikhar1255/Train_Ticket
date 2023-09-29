package com.trainticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainticket.entity.Train;
import com.trainticket.service.TrainService;

@RestController
public class TrainController {

	@Autowired
	private TrainService trainService;
	@GetMapping("/Trains")
	public List<Train> getAllProducts(){
		return trainService.getAllTrain();
	}
	
	@GetMapping("/Trains/{id}")
	public Train getTrain(@PathVariable("id")int id) {
		return trainService.getTrainById(id);
	}
	
	@PostMapping("/Trains")
	public Train addTrain(@RequestBody Train train) {
		Train t = this.trainService.addTrain(train);
		System.out.println(train);
		return train;
	}
	
	public void deleteTrain(@PathVariable("trainId")int id ) {
		this.trainService.deleteById(id);
	}
	
}
