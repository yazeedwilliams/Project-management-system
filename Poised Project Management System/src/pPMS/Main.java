package pPMS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		// Projects object
		Projects project1 = new Projects();
		System.out.println("Project details: ");
		System.out.println(project1.projectName);
		System.out.println(project1.projectNumber);
		System.out.println(project1.buildingType);
		System.out.println(project1.ERF);
		System.out.println(project1.totalFee);
		System.out.println(project1.deadline);
		System.out.println(project1.completed);

		
		
		
		// People objects
		// Architect
		People architect = new People();
		System.out.println(architect.name);
		System.out.println(architect.telNumber);
		System.out.println(architect.emailAddress);
		System.out.println(architect.physicalAddress);
		
		// Contractor
		People contractor = new People();
		System.out.println(contractor.name);
		System.out.println(contractor.telNumber);
		System.out.println(contractor.emailAddress);
		System.out.println(contractor.physicalAddress);
		

	}

}
