package javaDemo;

import java.util.Iterator;

public class ArraysPractice {

	public static void main(String[] args) {
		
		//way-1 of arrays
		String[] names = {"Tipu","Dipu","Reza","Abc","Xyz"};
		
		//for each loop
		
		for(String eachname:names) {
			System.out.println(eachname);
		}
		
		int[]nums = {16028, 0176544, 01234446, 887743, 876548};
		
			
		
		char[] ch1 = {'a','b','c','d','e'};
		
		/*System.out.println(names[3]);
		System.out.println(names.length);
		
		System.out.println(ph[0]);
		System.out.println(ph.length);
		
		System.out.println(ch1[4]);
		System.out.println(ch1.length);*/
		
		//way-2 of arrays
		String[] obj = new String[5];
		
		obj[0] = "Dipu";
		obj[1] = "Tipu";
		obj[2] = "Reza";
		obj[3] = "Selim";
		obj[4] = "Moriom";
		
		/*int i = 0;
		while(i<=4) {
		
		System.out.println(obj[i]);
		i++;
		}*/
		//for loop syntax
		for(int j=0;j<obj.length; j=j+1) {
			System.out.println(obj[j]);
		}
		
		
			
		
		
			
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
