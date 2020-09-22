package studentdabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private int tuitionBalance;
	private int costOfCourse;
	
	// Constructor: Prompt user to enter students's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " "+ lastName + " " + gradeYear);
	}
	
	// Generate an ID
	
	// Enroll in courses
	
	// View balance
	
	// Show status

}
