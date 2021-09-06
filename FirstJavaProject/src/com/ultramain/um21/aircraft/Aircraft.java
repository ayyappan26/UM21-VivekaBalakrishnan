package com.ultramain.um21.aircraft;

public class Aircraft {
	private String serial;
	private int ManufacturedYear;
	private String owner;
	private String shop;
	 
	public Aircraft(){
		serial = "A302";
		ManufacturedYear = 2000;
		owner ="Emirates";
		shop ="Dubai";
	}
	public void setSerial(String srl){
		this.serial=srl;
	}
	public void showAircraftdetails(){
		System.out.println("Serial=" + serial);
		System.out.println("Manufactured Year=" + ManufacturedYear);
		System.out.println("Owner=" + owner);
		System.out.println("Shop=" + shop);
	}
}
