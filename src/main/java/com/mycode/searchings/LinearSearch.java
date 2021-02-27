package com.mycode.searchings;

public class LinearSearch {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		 int[]  INPUT_ARRAY = {9,5,1,7,3,19,4,2};
		 System.err.println("Min: "+searchForMin(INPUT_ARRAY));
		 System.err.println("Max: "+searchForMax(INPUT_ARRAY));
	}
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static int searchForMax( int[] input) {
		int max =0;
		for (int i = 0; i < input.length; i++) {
			if(input[max] < input[i]) {
				max = i;
			}
		}
		return input[max];
	}
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static int searchForMin( int[] input) {
		int min =0;
		for (int i = 0; i < input.length; i++) {
			if(input[min] > input[i]) {
				min = i;
			}
		}
		return input[min];
	}
}

