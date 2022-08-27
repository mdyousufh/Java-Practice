package com.yousuf.java.oops;

public class MethodOverloading {
	
	static int myMethod(int x) {
		
		return x;
	}
	
	static float myMethod(float y) {
		
		return y;
	}
	
  

	public static void main(String[] args) {
		
		int num = myMethod(5);
		System.out.println(num);
		float f = myMethod(5);
		System.out.println(f);

	}

}
