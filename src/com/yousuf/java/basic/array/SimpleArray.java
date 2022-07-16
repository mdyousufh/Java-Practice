package com.yousuf.java.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] array = {1,2,3,4,5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("--------------------------");
		int[] array1 = new int[5];
		
		System.out.println("Enter the Array int type Element: ");
		
		for(int i = 0; i<5; i++) {
			
			array1[i] = in.nextInt();
			
		}
			
			System.out.println(Arrays.toString(array1));
			
		
		
		
	}

}
