package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		
		//creat object for ArrayClass
		//Syntax
		//List<Integer> id = new ArrayList<Integer>();
		
		//List<Integer> id = new LinkedList<Integer>();		
		
	/*	id.add(2);
		id.add(5);
		id.add(10);
		id.add(15);
		id.add(20);
		id.add(25);
		id.add(27);
		id.add(30);
		id.add(10);
		id.add(20);
		System.out.println(id);
		
		System.out.println(id.size());
		
		for(Integer eachId:id) {
			System.out.println( eachId);
		}
		
		//System.out.println(id.size());
		
	    // id.add(51);
		//System.out.println(id.add(51));
		
		/*for(Integer eachId:id) {
			System.out.println( eachId);
			
		}
		
		id.remove(4);
		System.out.println(id);
		for(Integer eachId:id) {
			System.out.println( eachId);
		}
		System.out.println(id.contains(20));
		
		id.clear();
		System.out.println(id.isEmpty());*/
		
		
		
		List<String> name = new ArrayList<String>();
		
		name.add("Moriom");
        name.add("Mahee");
        name.add("XYZ");
        name.add("ABC");
        name.add("EFG");
        name.add("Fatimah");
        
        System.out.println(name.size());
        
       /* System.out.println(name);
        name.add("Ayan");*/
		
        System.out.println(name);
        for(String eachname:name) {
        	System.out.println(eachname);
        }
        
        name.remove(3);
        
        System.out.println(name);
        System.out.println(name.contains("ABC"));
        
        name.clear();
        System.out.println(name.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
	}

}
