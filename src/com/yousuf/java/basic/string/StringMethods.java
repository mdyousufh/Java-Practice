package com.yousuf.java.basic.string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "";
		
		System.out.println(s1.isEmpty()); // true because in "" no string or no space
		
		String s2 = " Yousuf Hossan ";
		System.out.println(s2.trim()); // trim() remove space 1st and last side  
		
		String s3 = " ";
		System.out.println(s3.trim().isEmpty());
		
		String s4 = "yousuf";
		String s5 = "YOUSUF";
		System.out.println(s4.equalsIgnoreCase(s5));
		
		String s6 = "a"; //97 decimal value
		String s7 = "A"; // 65 decimal value
		
		System.out.println(s6.compareTo(s7)); // 97 - 65 = 32
		
		System.out.println(s6.compareToIgnoreCase(s7));
		
	
		
		

	}

}
