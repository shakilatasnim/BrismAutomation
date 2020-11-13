package com.shakilatasnim;

public class Mathmatics {

	 int a,b,c;
	  
     Mathmatics(int a,int b){
   	  
    	 this.a= a;  
      	  this.b=b;
      	  
      	  System.out.println("there is no parameter here");
        }      
    	 
     //constructor special kind of method which allows us to create  obj and initializing obj and 
        // also it eliminates null value.// "this" key word refer one obj to another obj. 
     //constructors are two types: 1.parameterized 2.non parameterized
    	 
    	  
  	 
   void add (){
	 
	 c= a+b;
	 System.out.println(c);
	 
}
   
   void sub() {
   	
   	c=a-b;
   	System.out.println(c);
   }
	
   void multiply() {
   	
   	c= a*b;
   	
   	System.out.println(c);
   }
}
