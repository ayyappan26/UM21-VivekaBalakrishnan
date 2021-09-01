package com.ultramain.um21.basics;

import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String[] arg){
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number...");
		int num = scan .nextInt();
		System.out.println("Printing Fibonnaci Series");
		System.out.println("0");
		System.out.println("1");
		int a=0,b=1,c,i;
		
		for(i=2;i<num;i++){
			c=a+b;
		System.out.println("" + c);
		a=b;
		b=c;
		}
		
	}

}
