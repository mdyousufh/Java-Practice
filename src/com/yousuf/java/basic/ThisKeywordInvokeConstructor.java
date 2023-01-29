package com.yousuf.java.basic;

public class ThisKeywordInvokeConstructor {

	ThisKeywordInvokeConstructor() {
		System.out.println("no args constructor");
	}

	ThisKeywordInvokeConstructor(int value) {
		this();
		System.out.println("Parametarised constructor");
	}

	public static void main(String[] args) {

		ThisKeywordInvokeConstructor object = new ThisKeywordInvokeConstructor(10);
	}

}
