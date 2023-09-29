package com.trainticket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Ticket_id")
	private int id;
	
	@Column(name="Train_name")
	private String name;

	@Column(name="Departure_station")
	private String departureStation;
	
	@Column(name="Arrival_station")
	private String arrivalStation;

	public Train(int id, String name, String departureStation, String arrivalStation) {
		super();
		this.id = id;
		this.name = name;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
	}
	
	public Train() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", departureStation=" + departureStation + ", arrivalStation="
				+ arrivalStation + "]";
	}
	

}
