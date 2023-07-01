package String1;

import java.util.Scanner;

public class A {
	
	
	public static void main(String[] args)  {
        int[] numbers = {5, 10, 2, 8, 15, 1};
        
        int max = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        for (int number : numbers) {
            if (number > max) {
                thirdMax = max;
                max = number;
            } else if (number > thirdMax && number < max) {
            	thirdMax = number;
            }
        }
        
        System.out.println("The third highest number is: " + thirdMax);
    }
}




