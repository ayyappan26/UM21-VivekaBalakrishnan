package com.ultramain.um21.week2;

public class VehicleSpeed {
	int speed;
	String name;
	
	public VehicleSpeed(String name, int speed){
		this.speed = speed;
		this.name = name;
	}
	public VehicleSpeed(){
		
	}
	public void getVehicleSpeed(){
			speed = speed + 20;
			System.out.println("Vehicle Speed=" + speed);
		}
	public void Stearing(){
		System.out.println("Vehicle has manual stearing...");
	}
	public void horn(){
		System.out.println("Vehicle has horn...");
	}
}
