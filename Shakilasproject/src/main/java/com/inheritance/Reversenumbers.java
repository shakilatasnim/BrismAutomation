package com.inheritance;

public class Reversenumbers {
 
	
  
 
	public static void main(String[] args) {
		String num= "123456";
		 int length= num.length();
		
	      String rev="";
		
		for(int i=length-1; i>=0; i--) {
			 rev= rev+num.charAt(i);
		}
		
		System.out.println(rev);
	}
	

}
