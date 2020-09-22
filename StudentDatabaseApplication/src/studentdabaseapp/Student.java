package studentdabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	
	//StudentID changed to string from int
	private String studentID;
	private int tuitionBalance;
	private static int costOfCourse;
	
	// Static value belongs to the class and not the instance of the object
	private static int id = 1000;
	
	// Constructor: Prompt user to enter students's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		//Call the setStudentID();
		setStudentID();
		
		// Print firstName, lastName, gradeYear and studentID.
		System.out.println(firstName + " "+ lastName + " " + gradeYear + " " + studentID );
	}
	
	// Generate an ID
	private void setStudentID() {
		//Grade level + ID
		// Increment ID
		id++;
		// The little quotations make the entire function be a string
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	
	// View balance
	
	// Show status

}
