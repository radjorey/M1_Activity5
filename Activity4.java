package ph.com.bpi.hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			if (age >=65) {
				System.out.println("Senior");	
			}
			else {
			System.out.println("Adult");
			}
		}
		else {
			System.out.println("Minor");
		}
		
		
	}

}
