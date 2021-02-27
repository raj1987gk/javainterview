package com.mycode;

public class MatrixPrinter {

	
	public static void main(String[] args) {
		printTraingle();
	}
	
	public static void printTraingle() {
		
		for (int i = 0; i < 5; i++) {
		
			for (int j = 0; j < 5; j++) {
				
				System.err.print("*");
			}
			System.err.println();
		}
		
		
	}
}
