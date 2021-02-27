package com.mycode.soritings;

import com.mycode.util.Utility;

public class BubbleSort {

	public static final int[]  INPUT_ARRAY = {9,5,1,7,3,19,4,2};
	public static void main(String[] args) {
		
		Utility.print(sort(INPUT_ARRAY));
	}
	
	
	
	public static int[] sort(int[] input) {
		int length = input.length;
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length-j-1; i++) {
				if(input[i] > input[i+1]) {
					int tmp = input[i];
					input[i] = input[i+1];
					input[i+1]=tmp;
				}
				
			}
		}
		return input;
	}
	
}
