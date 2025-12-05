package ph.com.bpi.hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int input1 = scanner.nextInt();
		
		System.out.println("Enter first integer: ");
		int input2 = scanner.nextInt();
		
		
		int sum = input1 + input2;
		int diff = input1 - input2;
		int prod = input1 * input2;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + prod);
		
		
	}

}
