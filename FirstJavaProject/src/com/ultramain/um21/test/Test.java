package com.ultramain.um21.test;

import com.ultramain.um21.javabasics.Car;

public class Test {
	public static void main(String[] arg){
		Car.carType= "Sedan";
		Car.carModel=1998;
		Car.carPrice=122.0f;
		
		Car.printCarDetails();
	}

}
