package ua.lviv.nazpet;

public class Application {

	
	public static void main(String[] args) {
		boolean ans = true;
		char symbol = '\u0066';
		byte asd = 3;
		short dsa = 12932;
		int her = 30203490;
		long htdd= 89023;
		System.out.println("Масив випадкових чисел:");
		 int [] nums = new int[]{18, 445, 200, 3, 1893, 17};
		 for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		int min = nums[0];
		    for (int num : nums) {
		        if (num < min) {
		            min = num;
		        }
		    }
		System.out.println("Найменше: " + min);
		int max = nums[0];
	    for (int num : nums) {
	        if (num > max) {
	            max = num;
	        }
	    }
	    System.out.println("Найбільше: " + max); 
		 
		
	}
}
