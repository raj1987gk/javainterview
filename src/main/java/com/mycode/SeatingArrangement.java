package com.mycode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SeatingArrangement {

	static int[][] seats;
	static {
		seats = new int[6][18];
		int num=1;
		for (int i = 0; i < 18; i++) {
			if(i%2==0) {
				for (int j = 0; j < 6; j++) {
					seats[j][i] = num++;
				}
			}else {
				for (int j = 5; j>=0; j--) {
					seats[j][i] = num++;
				}
				
			}
		}
		
	}
	
	public static void main(String[] args)throws Exception {
		printSeats();
		System.out.println("Seat: 18: "+getSeatType(18));
		System.out.println("Seat: 102: "+getSeatType(102));
		System.out.println("Seat: 67: "+getSeatType(67));
		System.out.println("Seat: 45: "+getSeatType(45));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(br.readLine()); 
        for (int i = 0; i < noOfTestCases; i++) {
        	getSeatType(Integer.parseInt(br.readLine()));
		}
		
	}
	
	
	static void printSeats() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 18; j++) {
				System.err.print(seats[i][j]+" ");
			}
			System.err.println();
		}
	}
	
	
	static String getSeatType(int seatNumber) {
		String results ="NA";
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 6; j++) {
					if(seats[j][i] ==seatNumber) {
						String seatType="";
						if(j==0|| j==5)seatType = "WS";
						if(j==1|| j==4)seatType =  "MS";
						if(j==2|| j==3)seatType =  "AS";
						int setPosNum =0;
						if(i%2==0) {
							setPosNum =i+1;
						}else {
							setPosNum =i-1;
						}
						int facingSeatNum =  seats[j][setPosNum];
						results = facingSeatNum+" "+seatType;
	
					}
				}
			}
		
		return results ;
		
	}
	
	
	
//	int facingSeatNum =  seats[setPosNum][j];
//	results = facingSeatNum+" "+seatType;
	
	
}
