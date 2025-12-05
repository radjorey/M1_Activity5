package ph.com.bpi.hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		String input = scanner.next();
		int intcon = Integer.parseInt(input);
		double dobcon = intcon;
		
		System.out.println("Enter age as int: " + intcon);
		System.out.println("Enter age as double: " + dobcon);
		
		
		
	}

}
