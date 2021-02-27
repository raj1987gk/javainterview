package com.mycode.stringmanipulations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.el.stream.Stream;

public class StringManipulation {

	private static final String filePath = "E:\\Workspace\\mycode\\src\\main\\java\\com\\mycode\\stringmanipulations\\data.txt";
	public static void main(String[] args)throws Exception {
		fetchParagraph();
	}
	
	private  static void fetchParagraph() throws IOException{
		System.out.println("No of Distinct words in file: "+Files.lines(Paths.get(filePath)).flatMap((String line) -> Arrays.stream(line.split(" "))).distinct().count());
		Scanner scanner = new Scanner(new File(filePath));
		scanner.useDelimiter("\r\n\r\n");
		while(scanner.hasNext()) {
			System.out.println();
			System.err.println(scanner.next());
			System.out.println();
			System.err.println("*****************************************************************************");
			System.out.println();
		}
	}
}
