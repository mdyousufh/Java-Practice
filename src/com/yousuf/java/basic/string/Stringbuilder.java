package com.yousuf.java.basic.string;


/*
 * mutable and non-synchronized method
 * 
 */
public class Stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		StringBuilder sb1 = new StringBuilder("Hossan");
		System.out.println(sb1.capacity());
		System.out.println(sb1.reverse());

		
	}

}
