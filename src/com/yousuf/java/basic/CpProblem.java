package com.yousuf.java.basic;

import java.util.Scanner;

public class CpProblem {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T,N,M,add = 0,mod;
		
		T = in.nextInt();
		
		for(int i = 1; i<=T; i++) {
			
			N = in.nextInt();
			M = in.nextInt();
			
			add = add+N;
			
			mod = add % M;
			
			
			System.out.println("Case #"+T+": "+mod);
			
			
		}
		

	}

}
