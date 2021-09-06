package com.ultramain.um21.week2;

public class Family {
	public static void main(String [] arg){
		Son myson = new Son();
		myson.Dad();
		myson.kid();
		myson.sleepinghours();
		myson.sleepinghours("12 hrs" , 10);
	}	

}

class Dad{
	public void Dad(){
		System.out.println("Head of the family...");
	}
	public void sleepinghours(){
		System.out.println("Dad sleeps 8hrs a day...");
	}
}

class Son extends Dad{
	public void kid(){
		System.out.println("The youngest in the family...");
	}
	
	public void sleepinghours(String hours, int age){
		System.out.println("The kid sleeps for.." + hours);
		System.out.println("The age of the kid is..." + age);
	}
}