package com.practice.program.interview;

public class Swap2Numbers {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Given numbers a, b: "+a+","+b);
		/*int c;
		c = a;
		a = b;
		b = c;
		System.out.println("Swaping of two numbers using 3rd variable!!");
		System.out.println("values of a and b after swap: "+a+","+b);
*/
		//Swaping without using another variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("swaping of 2 numbers without 3rd variable");
		System.out.println("values of a nd b after swp: "+a+" ,"+b);
	}
}

