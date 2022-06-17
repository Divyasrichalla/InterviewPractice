package com.practice.program.interview;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Divya";
		String x = "";
		System.out.println("Given String is: "+s);
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println(c);
			x = c+x;
		}
		System.out.println("Reverse of String is: "+x);
	}
}
