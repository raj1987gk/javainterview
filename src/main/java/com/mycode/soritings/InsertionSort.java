package com.mycode.soritings;

import com.mycode.util.Utility;

public class InsertionSort {
	public static  int[]  INPUT_ARRAY = {9,5,1,7,3,19,4,2};
	public static void main(String[] args) {
		Utility.print(sort(INPUT_ARRAY));
	}
	
	/**
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[]  sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i-1;
			for (; j >=0 && a[j] > key ; j--) {
						a[j+1] = a[j];
			}
			a[j+1] = key;
		}
		return a;	
	}
	
	
	
	
}
