package com.inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collectionclass {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList();//ArrayList: follows insertion order//
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	
	System.out.println(list);
	System.out.println(list.get(2));
	
	Set<String> setName=new HashSet<String>();//HashSet:does not follow insertin order//
	
	 setName.add("water");
	 setName.add("apple");
	 setName.add("cabage");
	 setName.add("grapes");
	 setName.add("banana");
	 setName.add("hen");
	 System.out.println(setName);
	 
	 Iterator it= setName.iterator();
	 while(it.hasNext()){
	 if(it.next()== "hen"){
	 
	 System.out.println("dont bring it here");}
	 }
	
	 Set<String> setName2=new LinkedHashSet<String>();//LinkedHashSet::follows insertion order//
		
	 setName2.add("water");
	 setName2.add("apple"); 
	 setName2.add("cabage");
	 setName2.add("grapes");
	 setName2.add("banana");
	 setName2.add("hen");
	 System.out.println(setName2);
	 
	 Set<String> setName3=new TreeSet<String>();//TreeSet: follows ascending order//
		
	 setName3.add("water");
	 setName3.add("apple");
	 setName3.add("cabage");
	 setName3.add("grapes");
	 setName3.add("banana");
	 setName3.add("hen");
	 System.out.println(setName3);
	 
	 Map<Integer,String> setName4=new HashMap();
	 setName4.put(101, "shakila");	
	 setName4.put(102, "tasnim");	
	 setName4.put(103, "shajib");	
	 setName4.put(104, "alvan");	
	 setName4.put(105, "aiman");
	 setName4.put(null, "Lincoln");	



	 
	 System.out.println(setName4);
	 


	 
	
	
	}

}
