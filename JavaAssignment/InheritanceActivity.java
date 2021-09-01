package com.ultramain.um21.salarycalculator;

public class InheritanceActivity {
	static Manager manager = new Manager();
	static Trainee trainee = new Trainee();
	
	public static void main(String[] args) {
		
		testCase1(); 
		System.out.println(manager.calculateTransportAllowance()); 
		
		testCase2(); 
		System.out.println(trainee.calculateTransportAllowance()); 
		
		
	}

	protected static void testCase1() {
		
		manager.setEmployeeId(126534);
		manager.setEmployeeName("Peter");
		manager.setEmployeeAddress("Chennai India");
		manager.setEmployeePhone(237844);
		manager.setBasicSalary(65000);
		manager.calculateSalary();
		
	}

	protected static void testCase2() {
		
		trainee.setEmployeeId(29846);
		trainee.setEmployeeName("Jack");
		trainee.setEmployeeAddress("Mumbai India");
		trainee.setEmployeePhone(442085);
		trainee.setBasicSalary(45000);
		trainee.calculateSalary();
		
	}
}

