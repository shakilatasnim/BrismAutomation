package com.shimu;

public class Stringbuilderbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Country= "united states of america";
		   
		   String[]pieces = Country.split(" ");
		   
		   System.out.println(pieces.length);
		   
		  String newCountry= Country.replace(" ", "");
		  System.out.println("Alphabet no is: "+ newCountry.length());
		  
		  //reverse the string name and print it//
		  //Stringbuilder=Stringbuffer//
		  
		  StringBuffer rev= new StringBuffer(Country);
		   String reverse= rev.reverse().toString();
		  
		   System.out.println(rev.reverse());
		   
	
	}

}
