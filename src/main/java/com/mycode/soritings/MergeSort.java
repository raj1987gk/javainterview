package com.mycode.soritings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {
	public static  int[]  INPUT_ARRAY = {9,5,5,1,6,8,5,3,7,11};
	
	
	public static void main(String[] args) {
		print(INPUT_ARRAY);
		print(mergeSort(INPUT_ARRAY));
	}
	
	
	public static int[] mergeSort(int[] array) {
		int length = array.length;
		if(length < 2)return array;
		int mid = length/2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		splitAndpopulate(left, right, array, mid);
		 left = mergeSort(left);
		 right = mergeSort(right);
		return merge(left, right);
	}
	
	
	private static int[] merge(int[] left,int[] right) {
		int l = left.length;
		int r = right.length;
		int[] result = new int[l+r];
	
		int i=0,j=0,index=0;
			
		while(i<left.length &&  j <right.length) {
			if(left[i] > right[j]) {
				result[index]= right[j];
				index++;
				j++;
			}else {
				result[index]= left[i];
				index++;
				i++;
			}
			
		}
		
		while(i < left.length) {
			result[index]= left[i];
			index++;
			i++;
		}
		
		while(j <right.length) {
			result[index]= right[j];
			index++;
			j++;
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param left
	 * @param right
	 */
	private static void splitAndpopulate(int[] left,int[] right,int[] array,int mid) {
		int l = left.length;
		int r = right.length;
		for (int i = 0; i < array.length; i++) {
			if(i < mid) left[i]=array[i];
			if(i >= mid) right[i-mid] = array[i];
		}
		
	}
	static int i=0;
	private static 	void print(int[] array) {
		String test = Arrays.stream(array).mapToObj(e -> e+"").collect(Collectors.joining(","));
		System.err.println(i+": "+test);i++;
	}
}
