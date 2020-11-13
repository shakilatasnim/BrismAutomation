package com.shimu;

public class Mathprbs {

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sales= {6,9,6,10,9,7,14,15,13,11};
		  
		  int totalsale =0;
		  
		  for(int i=0;i<sales.length; i++) {
			  totalsale = totalsale+ sales[i]; 
		
		  }
		  
		  System.out.println(totalsale);
		  
		  double avg = totalsale/sales.length;
		  
		  System.out.println(avg);
		  
		  int counter=0;
		  
		  for (int i=0; i<sales.length; i++) {
			  if(sales[i]>avg) {
				  counter= counter+1;
			  }
				  }
		  
		  System.out.println(counter);
		  
	}
	

}
