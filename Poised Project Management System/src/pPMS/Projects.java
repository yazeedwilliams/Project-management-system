package pPMS;

import java.util.Scanner;

public class Projects {
	String projectName;
	int projectNumber;
	String buildingType;
	int ERF;
	int totalFee;
	String deadline;
	String completed;
	
	// constructor
	public Projects() {
		System.out.print("Enter the name of the project: ");
		Scanner input = new Scanner(System.in);
		projectName = input.nextLine();
		
		System.out.print("Enter the number of the project: ");
		Scanner input2 = new Scanner(System.in);
		projectNumber = input2.nextInt();
		
		System.out.print("Enter the building type: ");
		Scanner input3 = new Scanner(System.in);
		buildingType = input3.nextLine();
		
		System.out.print("Enter the ERF: ");
		Scanner input4 = new Scanner(System.in);
		ERF = input4.nextInt();
		
		System.out.print("Enter the totalFee: ");
		Scanner input5 = new Scanner(System.in);
		totalFee = input5.nextInt();
		
		System.out.print("Enter the deadline of the project (dd/mm/yyyy): ");
		Scanner input6 = new Scanner(System.in);
		deadline = input6.nextLine();
		
		System.out.print("Is the project completed: ");
		Scanner input7 = new Scanner(System.in);
		completed = input7.nextLine();
		
		
		
	}


}