package com.trinity;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		  HashSet<String> h = new HashSet<String>();

	        h.add("This");
	        h.add("is");
	        h.add("a");
	        h.add("HashSet");

	        System.out.println(h);
		
	        TreeSet<String> set=new TreeSet<String>();  
	        set.add("Krunal");  
	        set.add("Lathiya");  
	        set.add("Rushabh");  
	        set.add("Rupani"); 
	        
	        System.out.println(set);

	        HashSet<String> set1 = new HashSet<String>();
	        set1.add("hi");
	        set1.add("i");
	        set1.add("am");
	        set1.add("Mahadev");
	  
	        System.out.println("Original HashSet: "+ set1);
	                           
	  
	        // Sorting HashSet using TreeSet
	        TreeSet<String> treeSet = new TreeSet<String>(set1);
	        System.out.println("HashSet elements in sorted order using TreeSet " + treeSet);
	                         
	        Deque<String> deque = new LinkedList<>();

	        deque.add("jspider");
	        deque.add("qspider");
	        deque.add("pyspider");

	        for(String element : deque) {
	            System.out.println(element);
	        }             
		
		
		
	}

}
