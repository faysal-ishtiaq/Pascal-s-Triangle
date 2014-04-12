package com.rabby.prac;

import java.util.Scanner;

public class PascalTriangle {

	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		prln("------------WELCOME-----------");
		prln("Input -1 to exit.");
		
		pr("Input Pascal Triangle Size : ");
		
		int userInput = myScanner.nextInt();
		
		while (userInput != -1) {
			if(userInput < -1 && userInput > 100){
				pr("Give input between -1~100 : ");
				userInput = myScanner.nextInt();
				continue;             
			}
			pascalTriangle(userInput);
			pr("Input Pascal Triangle Size : ");
			userInput = myScanner.nextInt();
		}
		
		
	}
	
	static void pascalTriangle(int length){
		int[][] pascal = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			pascal[i][0] = 1;
			pascal[0][i] = 1;
		}
		
		for (int row = 1; row < length; row++) {
			for (int column = 1; column < length; column++) {
				pascal[row][column] = pascal[row-1][column] + pascal[row][column-1];
			}
		}
		
		for (int row = 0; row < length; row++) {
			for (int column = 0; column < length-row; column++) {
				pr(pascal[row][column]+"\t");
			}
			prln("");
		}
	}
	
	static void prln(Object object){
		System.out.println(object);
	}
	
	static void pr(Object object){
		System.out.print(object);
	}

}
