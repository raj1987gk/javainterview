package com.mycode.soritings;

import com.mycode.util.Utility;

public class QuickSort {
	public static  int[]  INPUT_ARRAY = {9,5,1,7,3,19,4,2};
	public static void main(String[] args) {
		sort(INPUT_ARRAY);
		Utility.print(INPUT_ARRAY);
	}
	
	public static int[] sort(int[] input) {
		quickSort(input, 0, input.length-1);
		return input;
	}
	
	
	
	
	/**
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	private static void quickSort(int[] array, int low,int high) {
		//check for empty or null array
        if (array == null || array.length == 0){
            return;
        }
		if(low >= high)return;
		
		int pivoteIndex = low + (high - low) / 2;
		int pivot = array[pivoteIndex];
		
		int i=low,j=high;
		while (i <= j) 
	        {
			while(array[i] < pivot) i++;
			while(array[j] > pivot) j--;
			if(i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
        }
		if(low < j) {
			quickSort(array, low, j);
		}
		if(high > i) {
			quickSort(array, i, high);
		}
	} 
	
	private  static  void swap(int[] array, int i,int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
}
