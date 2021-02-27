package com.mycode.util;

public class Utility {


	public static void print(int[] input) {
		System.out.println();
		System.out.println("Sorted array is:");;
		for (int i : input) {
			System.out.print(i+" ");;
		}
	}
	
	public  static  void swap(int[] array, int i,int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
