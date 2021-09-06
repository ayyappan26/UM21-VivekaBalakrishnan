package com.ultramain.um21.week2;

public class Vehicle {
		public static void main(String[] arg){
			Maruthicar myCar= new Maruthicar();
		}
	}
		
	class VehicleTest{
			public VehicleTest() {
				System.out.println("In Vehicle...");
			}
		}
	class van extends VehicleTest{
		public van(String msg){
			System.out.println("Message=" + msg);
		}
	}
	class Maruthicar extends van{
		public Maruthicar(){
			super("Hello");
			System.out.println("Maruthi Car...");
		}
	}
