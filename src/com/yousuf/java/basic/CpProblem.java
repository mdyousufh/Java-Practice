package com.yousuf.java.basic;

import java.util.Scanner;

public class CpProblem {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T,N;
		
		T = in.nextInt();
		
		for(int i = 1; i<=T; i++) {
			
			N = in.nextInt();
			
			int result = N/2;
			
			
			System.out.println("Case #"+T+": "+result);
			
			
		}
		

	}

}
