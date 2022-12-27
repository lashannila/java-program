package com.java.program;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
	      
		int h,b,s;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value of h=");
		h=scan.nextInt();
		
		System.out.println("Enter the value of b=");
		b=scan.nextInt();
		
		System.out.println("Enter the value of s=");
		s=scan.nextInt();
		 


		
		int area=(h*b)/2;
		int perimeter=h+b+s;
		
		System.out.println("Area=" + area);
		System.out.println("Perimeter=" + perimeter);
	

	}

}
