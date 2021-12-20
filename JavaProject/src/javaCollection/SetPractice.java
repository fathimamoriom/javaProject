package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		//Set<Integer> id = new HashSet<Integer>();
		//Set<Integer> id = new TreeSet<Integer>();
		Set<Integer> id = new LinkedHashSet<Integer>();
		
		id.add(11);
		id.add(22);
		id.add(33);
		id.add(444);
		id.add(55);
		id.add(123);
		id.add(33);
		id.add(333);
		id.add(345);
		
		System.out.println(id);
		System.out.println(id.size());
		
		for(Integer eachId: id) {
			System.out.println(eachId);
	       }
		
		id.remove(444);
		System.out.println(id.contains(444));
		
		id.clear();
		System.out.println(id.isEmpty());
		
		for(Integer eachId: id) {
			System.out.println(eachId);
	       }
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
