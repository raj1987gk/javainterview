package com.mycode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FileProcessorTest {

    public static void main(String[] args)throws Exception {
    	String filePath = "E:\\Workspace\\mycode\\src\\main\\java\\com\\mycode\\testcase";
//        printFile(filePath);
        processInOldFashion(filePath);
    }
    

    static void printFile(final String filePath)throws Exception{
        Files.lines(Paths.get(filePath)).forEach(System.out::println);
    }

    
    static void processInOldFashion(final String filePath) throws Exception{
    
    	BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        int noOfTestCases = Integer.parseInt(br.readLine());                
        //System.out.println("noOfTestCases: "+noOfTestCases);

        for (int i = 0; i < noOfTestCases; i++) {
		
        	String[] prices =  br.readLine().split(" ");
        	int xPrice =Integer.parseInt(prices[0]);
        	int yPrice =Integer.parseInt(prices[1]);
        	if(i%2!=0) {
        		int tmp = xPrice;
        		xPrice =yPrice;
        		yPrice=tmp;
        	}
        	//System.err.println("xPrice:"+xPrice+" , yPrice:"+yPrice);
        	
        	//System.err.print("prices: ");
//        	Stream.of(prices).forEach(System.out::println);
        	int noOfPlayers = Integer.parseInt(br.readLine());   
        	int sum = 0;
        	for (int j = 0; j < noOfPlayers; j++) {
				String[] scores = br.readLine().split(" ");
				sum =sum + (Integer.parseInt(scores[0])* xPrice + Integer.parseInt(scores[1])* yPrice);
			}
        	System.out.println(sum);
		}
        
        
        
    	
    }
    
    
    
    
    
    
    static void proecssFile(final String filePath) throws Exception{
    	
    	int numOfTestCases = Integer.parseInt(Files.lines(Paths.get(filePath)).findFirst().get());
    	System.out.println("numOfTestCases:"+numOfTestCases);

    	/* For each test case */
    	IntStream.rangeClosed(1, numOfTestCases).forEach(x->{
    		
    		
    		
    	});
    	
    	Files.lines(Paths.get(filePath)).forEach(line ->{
    		
    		
    		
    		
    	});
    	
    	
    }
    
}
