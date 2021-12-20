package javaDemo;

public class ForEachLoop {

	public static void main(String[] args) {
        
		
		int[] nums = {10,20,30,40,50,60,70};
		
		String[] names = {"mamun", "hasan", "helal", "moriom", "hasan", "aisani", "raidaah"};
		
		
		
		for(int eachNum : nums) {
		System.out.println(eachNum);
		
		}
        System.out.println(".........................");


		for(String eachName : names) {
			
			System.out.println(eachName);
		}

	}

}
