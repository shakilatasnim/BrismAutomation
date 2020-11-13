package com.shimu;

public class Constructor {
 int a,b,c;
  
      Constructor(int a,int b){
    	  
    	                  //constructor special kind of method which allows us to create  obj and initializing obj and 
    	                 // also it eliminates null value
    	  
     	  this.a= a;  // "this" key word refer one obj to another obj
    	  this.b=b;
      }
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
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor obj1= new Constructor(10,20);
		   obj1.add();
		   obj1.sub();
		   obj1.multiply(); 
		
	}

}
