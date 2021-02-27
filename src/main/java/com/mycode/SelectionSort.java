package com.mycode;

import java.util.Arrays;
import java.util.stream.Stream;

public class SelectionSort {

	public static void main(String[] args) {
		int[] num = {3,5,4,1,2,9,6};
		sort(num);
		print(num);
	}
	
	
	
	public static int[] sort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.err.println(i+" Iteration");
			for (int j = i+1; j < num.length; j++) {
				if(num[j] < num[i]) {
					int tmp = num[j];
					num[j] =num[i] ;
					num[i] = tmp;
				}
				print(num);
				System.out.println();
			}
			
		}
		return num;
	}
	
	public static void print(int[] num) {
		Arrays.stream(num).forEach(System.out::print);
	}
	
	
	
	
}
