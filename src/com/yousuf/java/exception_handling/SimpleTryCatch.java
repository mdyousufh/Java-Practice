package com.yousuf.java.exception_handling;

import java.util.Scanner;

public class SimpleTryCatch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 10, b = 0;
		
		try{
			
			int c = a/b;
		}
		catch(Exception e) {
			
			System.out.println("You can't divide by Zero");
			e.printStackTrace();
			
		}

	}

}
