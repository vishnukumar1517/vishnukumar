package com.test;

import java.util.Scanner;

public class Charactercount {
	public static void main(String [] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String  sentence =scan.nextLine();
		sentence=sentence.toLowerCase();
		System.out.println("character"+" "+"no.of.time"  );
		for (char ch='a';ch<='z';ch++) {
			int count =0;
			for (int i=0;i<sentence.length();i++ ) {
				if (sentence.charAt(i)==ch)
				{
					count++ ;
				}
			}
					if(count>0) {
						System.out.println(ch+" " + count);
					}
						
				
			
		}
		
	}

}
