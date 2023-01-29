package com.yousuf.java.basic;

public class ThisKeywordInvokeMethod {

	public void display() {
		System.out.println("Hello World");
	}

	public void show() {
		this.display(); // we can directly call display() method compiler auto adds this keyword.
	}

	public static void main(String[] args) {

		ThisKeywordInvokeMethod object = new ThisKeywordInvokeMethod();

		object.show();
	}

}
