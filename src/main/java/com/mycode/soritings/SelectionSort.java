package com.mycode.soritings;

import com.mycode.util.Utility;

public class SelectionSort {

	public static  int[]  INPUT_ARRAY = {9,5,1,7,3,19,4,2};
	public static void main(String[] args) {
		sort(INPUT_ARRAY);
		Utility.print(INPUT_ARRAY);
	}
	
	public static void sort(int[] array) {

		for (int i = 0; i < array.length-1; i++) {
			int min =i,j;
			for (j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			if(min!=i) {
				Utility.swap(array, min, i);
			}
			
		}
		
		
	}
}
