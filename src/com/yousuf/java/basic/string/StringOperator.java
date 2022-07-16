package com.yousuf.java.basic.string;

/*
 == operator and .equals operator
 */

public class StringOperator {

	public static void main(String[] args) {
 
		String s1 = new String("Yousuf");
		String s2 = new String("Yousuf");
		
		System.out.println(s1==s2); // false because s1,s2 create two object
		
		String s3 = "Tania";
		String s4 = "Tania";
		System.out.println(s3==s4); // True because it doesn't create object(scp area in same name)
		
		/*
		 * == use for address comparison
		 * 
		 * .equals use for content
		 * 
		 * 
		 **/
		
		
		System.out.println(s1.equals(s2)); // true
		

	}

}
