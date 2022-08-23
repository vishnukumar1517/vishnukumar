package com.test;

public class Swap {

	public static void main(String[] args) {
		String name1="kumar";
		String name2="shyam";
		System.out.println("Before swap value:"+name1+" "+name2);
		
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length() );
		name1=name1.substring(name2.length());
		
		System.out.println("After swap value:"+name1+" "+name2);
		
		

	}

}
