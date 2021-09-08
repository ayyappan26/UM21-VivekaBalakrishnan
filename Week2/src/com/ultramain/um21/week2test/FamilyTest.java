package com.ultramain.um21.week2test;

public class FamilyTest {
	public static void main(String[] arg){
		Son myson= new Son();
		Daughter mydaughter = new Daughter();
		
		Details details = new Details();
		details.Details(myson);
		details.Details(mydaughter);
	}
}
class Grandfather{
	public void sleep(){
		System.out.println("Sleeps 12 hrs a day...");
	}
}
class Father extends Grandfather{
		public void work(){
			System.out.println("Earns money by doing business...");
		}
		public void eats(){
			System.out.println("Eats healthy food...");
		}
}
class Son extends Father{
	public void plays(){
		System.out.println("Plays throughout the day..");
	}
	public void eats(){
		System.out.println("Eats junk food...");
	}
}
class Daughter extends Father{
	public void plays(){
		System.out.println("Plays twice a week..");
	}
	public void eats(){
		System.out.println("Eats noodles.....");
	}
}
class Details{
	public void Details(Son myson){
		myson.eats();
		myson.work();
		myson.sleep();
		System.out.println("--------------------------");
		
	}
	public void Details(Daughter mydaughter){
		mydaughter.eats();
		mydaughter.work();
		mydaughter.sleep();
		System.out.println("--------------------------");
	}
}