package com.yousuf.java.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDarray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] b = {1,2,3};
		
		for(int i = 0; i<b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		System.out.println("----------------------");
		
		
		int[] a = new int[5];
		
		System.out.println("Enter the Array Element: ");
		
		for(int j = 0; j<a.length; j++) {
			
			a[j] = in.nextInt();
			
		}
		
			System.out.println(Arrays.toString(a));
		
		
	}

}
