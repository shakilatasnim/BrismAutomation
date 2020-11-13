package com.inheritance;

public class Childclass extends Parentclass{
	
	//with the word "extends" we connectt childclass and parent class, that is why we could
	//easily call the method in codetestinginheritance under main method//
	void getName() {
		System.out.println("shakila");
	}

	void getTitle() {
		
		System.out.println("tasnim");
	}
	
	
	void add() {
		int a= 10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	
	void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
}

