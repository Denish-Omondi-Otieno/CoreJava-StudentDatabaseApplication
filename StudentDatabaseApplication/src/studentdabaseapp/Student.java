package studentdabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	
	// Addition of courses in to our properties list
	private String courses = null;
	
	//StudentID changed to string from int
	private String studentID;
	
	// Initialise tuitionBalance to zero
	private int tuitionBalance = 0;
	
	// The cost of the course has to constant across the class hence static
	private static int costOfCourse = 600;
	
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
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			// If course is not equal to quit then we store course into courses
			if(!course.equals("Q")) { 
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				System.out.println("BREAK!");
				break;
				}
		} while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	// View balance
	
	// Show status

}
