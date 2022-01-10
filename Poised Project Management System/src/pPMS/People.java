package pPMS;

import java.util.Scanner;

public class People {
	String name;
	int telNumber;
	String emailAddress;
	String physicalAddress;
	
	public People() {
		System.out.print("Enter the name of the architect/ constructor: ");
		Scanner input1 = new Scanner(System.in);
		name = input1.nextLine();
		
		System.out.print("Enter the telephone number of the architect/ constructor: ");
		Scanner input2 = new Scanner(System.in);
		telNumber = input2.nextInt();
		
		System.out.print("Enter the email address of the architect/ constructor: ");
		Scanner input3 = new Scanner(System.in);
		emailAddress = input3.nextLine();
		
		System.out.print("Enter the physical address of the architect/ constructor: ");
		Scanner input4 = new Scanner(System.in);
		physicalAddress = input4.nextLine();
	}
	
}