package com.ultramain.um21.salarycalculator;

public class Trainee extends employee {

	protected static double getBasicSalary() {
		return basicSalary;
	}
	protected static void setBasicSalary(double basicSalary) {
		Manager.basicSalary = basicSalary;
	}
	
	@Override
	public double calculateTransportAllowance () {
		double transportAllowance = 15 * basicSalary/100;	
		return transportAllowance;
	}
}
