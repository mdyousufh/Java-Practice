package com.yousuf.java.basic.string;

/*
 * Case Conversion
 * toLowerCase()
 * toUpperCase()
 * 
 * */

/*
 * Type Conversion
 * valueOf()
 * toCharArray()
 * 
 * */

public class StringConversion {

	public static void main(String[] args) {
		
		String s1 = "YouSUF";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		int a = 10;
		String.valueOf(a);
		System.out.println(a); // its converts int value to String
		
	   char[] aa = s1.toCharArray(); // its converts String to char
	   System.out.println(aa); 
	   
	   
		
		

	}

}
