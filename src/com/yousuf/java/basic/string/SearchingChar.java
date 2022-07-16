package com.yousuf.java.basic.string;

public class SearchingChar {

	public static void main(String[] args) {
		
		String s1 = "YOUSUF";
		
		System.out.println(s1.indexOf("OU"));
		System.out.println(s1.lastIndexOf('U'));
		System.out.println(s1.charAt(3));
		System.out.println(s1.contains("SUF")); // return boolean value
		System.out.println(s1.startsWith("Y"));// return boolean value
		System.out.println(s1.endsWith("F")); // return boolean value
		
	}

}
