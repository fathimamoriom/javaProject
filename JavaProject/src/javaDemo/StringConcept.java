package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		
		String text ="I Love Bangladesh";
		String text1 ="I Am Bangladeshi";
        String text2 ="My Name Is Moriom";
        String text3 ="My Name Is Moriom";
		
		//Find the memory location/address of text,text1,text2 variable
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text2));
		
		//print the value of all variable 
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		
		//equal function.return true/false
		//equals function compare the value of two different variable
		System.out.println(text.equals(text1));
		System.out.println(text2.equals(text3));
		
		//== function.compare the memory address of String variable
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text2));
		
		//Lenth() function.return count of String
		String text4 ="I Love Bangladesh";
		System.out.println(text4.length());
		
		//concat() function.if we want to join more than one String
		System.out.println(text1.concat(text2));
		
		//if we want to join different datatype then we use +
		//same datatype result will be summation
		String num = "20";
		String num1 = "20";
		int a = 21;
		int b = 30;
		
		System.out.println(num+a);
		System.out.println(num+num1);
		System.out.println(a+b);
		
		//trim() method.want to white space from both side of a String use trim()
		
		String text5 = "   I Live In Bangladesh   ";
		System.out.println(text5);
		System.out.println(text5.length());
		System.out.println(text5.trim());
		System.out.println(text5.trim().length());
		
		//toLowerCase().convert to all lowercase
		System.err.println(text5.toLowerCase());
		
		//toUperCase(). convert to all String upercase
		System.out.println(text5.toUpperCase());
		
		//contains().given String is available in entire String or not/return true or false
		System.out.println(text5.contains("ang"));
		System.out.println(text5.contains("anl"));
		System.out.println(text5.contains("Liv"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
