package com.ultramain.um21.basics;

public class Greet {
	int time=6;
	
	public Greet(int time) {
		this.time=time;
	}

	public void greetMessage(){
		greetMorning();
		greetEvening();
		greetNight();
	}
	
	public void greetMorning(){
		System.out.println("Good Morning...");
	}
	
	public void greetEvening(){
		System.out.println("Good Evening...");
	}
	
	public void greetNight(){
		if(time>20){
		System.out.println("Good Night...");
	}
	}
}
