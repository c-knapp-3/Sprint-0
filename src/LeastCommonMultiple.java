package Sprint0;
import java.util.Scanner;

public class LeastCommonMultiple {
	
	public static int getPositiveNumber(Scanner scnr) {
		
		int userNumber = 0;
		while (userNumber <= 0) {
			userNumber = scnr.nextInt();
			if (userNumber <= 0) {
				System.out.println("The number entered must be positive, please try again ->");
			}
		}
		return userNumber;			
	}
			
	public static int findGreatestCommonDivisor(int a, int b) {
		
		int num1 = a;
		int num2 = b;
				
		while (num1 != num2) {
			if (num2 > num1) {
				num2 = num2 - num1;
			}
			else {
				num1 = num1 - num2;
			}
		}
		return num1;
	}
			
	public static int calculateLeastCommonMultiple(int a, int b) {
		
		int leastCommonMultiple = Math.abs(a * b) / findGreatestCommonDivisor(a, b);
		return leastCommonMultiple;
	}
		

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int userNumber1;
		int userNumber2;
		int leastCommonMultipleResult;
			
		System.out.println("To find the least common multiple of two numbers, please enter your first positive number -> ");
		userNumber1 = getPositiveNumber(scnr);
		System.out.println("Please enter your second number -> ");
		userNumber2 = getPositiveNumber(scnr);
		
		System.out.println(findGreatestCommonDivisor(userNumber1, userNumber2));
		leastCommonMultipleResult = calculateLeastCommonMultiple(userNumber1, userNumber2);
		
		System.out.println("\nThe least common multiple of " + userNumber1 + " and " + userNumber2 + "  " + leastCommonMultipleResult + ".");
	}
}



