package com.ultramain.um21.test;

import com.ultramain.um21.javabasics.Display;
import com.ultramain.um21.laptop.Laptop;

public class LapTest {
	public static void main(String[] arg){
		Laptop myLaptop = new Laptop();
		myLaptop.setModel("Thinkpad");
		myLaptop.setCompanyName("HP");
		myLaptop.setProcessorType("i5");
		myLaptop.setRamSize("16GB");
		myLaptop.setPurchasedYear(2000);
		
	Display lapDisplay= new Display();
	lapDisplay.displayLaptopDetails(myLaptop);
	}
}
