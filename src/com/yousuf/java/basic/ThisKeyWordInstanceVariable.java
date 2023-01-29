package com.yousuf.java.basic;

/*
 * This keyword is refer to the current class instance variable.
 * this keyword can be used to invoke current class method
 * this() keyword can be used to invoke current class constructor
 * this keyword can be used to pass an argument in the method call.
 * this keyword can be used to pass an argument in the constructor call.
 */

public class ThisKeyWordInstanceVariable {

	int value;

	public void setValue(int value) {

		this.value = value;

	}

	public void show() {
		System.out.println(value);
	}

	public static void main(String[] args) {

		ThisKeyWordInstanceVariable object = new ThisKeyWordInstanceVariable();

		object.setValue(10);
		object.show();

	}

}
