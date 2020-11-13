package com.shimu;

public class Shirt {

	//Constructor: is a special type of method which is responsible for creating and
	//initializing objects. consturctor eliminates null value.
public static String color;
public static String size;
   
   Shirt(){
	 System.out.println("this shirt is a constructor");
 }
  
   public static void Setcolor(String newcolor) {
	   color= newcolor;
   }
   
   public static void Setsize(String newsize) {
	   size= newsize;
   }
   
public static void puton() {
	System.out.println("shirt is on");
	}
	
public static void putoff() {
	System.out.println("shirt is off");
}
	public static void main(String[] args) {
		 
        Shirt s= new Shirt();
        s.puton();
        s.putoff();
        s.Setcolor("blue");
        s.Setsize("M");
        
        System.out.println(s.size);
        System.out.println(s.color);
	}

}
