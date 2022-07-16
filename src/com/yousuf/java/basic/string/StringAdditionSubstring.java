package com.yousuf.java.basic.string;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		
		String s1 = " YOUSUF";
		String s2 = " HOSSAN";
		
		String s3 = "MD";
		System.out.println(s1.concat(s2));
		
		System.out.println(s3+s1);
		
		System.out.println(String.join(":",s1, s2,s3)); 
		
		String s4 = "MD Yousuf Hossan";
		
		System.out.println(s4.subSequence(3, 7)); //  return char sequence works 
		
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(3, 6)); // return string 
		
		  
		

	}

}
