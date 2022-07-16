package com.yousuf.java.basic.array;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
			
		int row = in.nextInt();
		int col = in.nextInt();
		
		System.out.println("Enter array elements : ");    
		int[][] a = new int[row][col];
		
		
		for(int i = 0; i<row; i++) {
			
			for(int j = 0; j<col; j++) {
				
				a[i][j] = in.nextInt();
			}	
		}
		
	  System.out.println("Elements in The Arrays : ");
		
       for(int i = 0; i<row; i++) {
			
			for(int j = 0; j<col; j++) {
				
				System.out.println(a[i][j]);
			}	
			
		}   

  }
}