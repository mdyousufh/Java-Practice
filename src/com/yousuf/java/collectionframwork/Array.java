package com.yousuf.java.collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(10);
		list.add("Yousuf");
		list.add("Reza");
		
		Iterator it = list.iterator();
	
		while (it.hasNext()) {

			System.out.println(it.next()); /*
											 * 10 Yousuf Reza
											 */
		}
		System.out.println(list); // print [10,Yosuf, Reza]
		
		
		ListIterator litr = list.listIterator();
		
		

	}

}
