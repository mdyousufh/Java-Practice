package com.yousuf.java.basic;

public class ThisKeywordPassAnArgInMethodCall {

	public void one(ThisKeywordPassAnArgInMethodCall a) {
		System.out.println("Method one");
	}

	public void two() {
		one(this);
	}

	public static void main(String[] args) {
		ThisKeywordPassAnArgInMethodCall object = new ThisKeywordPassAnArgInMethodCall();
		object.two();

	}

}
