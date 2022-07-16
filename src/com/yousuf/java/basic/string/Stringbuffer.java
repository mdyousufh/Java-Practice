package com.yousuf.java.basic.string;


/*
 * If our data frequently changed 
 * then we should use String Buffer
 * 
 * mutable and synchronized method
 * 
 * 
 * */
public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Yousuf");
		StringBuffer sb1 = new StringBuffer("Yousuf");
		
		sb.append(" Hossan"); // append use for string concate
		
		System.out.println(sb);
		
		
		StringBuffer sbf = new StringBuffer("Hossan Java JA AAfjf"); 
		System.out.println(sbf.capacity());//16+ string length
		
		System.out.println(sbf.length());
		System.out.println(sb.equals(sb1));// false because it's refer two object.
		
		System.out.println(sbf.indexOf("J"));
		System.out.println(sbf.replace(5, 11, "K"));
		
		System.out.println(sb.reverse());
		System.out.println(sb.substring(4));
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(100);// increase capacity
		System.out.println(sbf.capacity());
	    sb.setLength(2);// set maximum length
	    System.out.println(sb);
	    sb.trimToSize();
	    System.out.println(sb.capacity());// remove extra memory 
		

	}

}
