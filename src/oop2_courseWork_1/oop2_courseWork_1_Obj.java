package oop2_courseWork_1;

import java.util.ArrayList;
import java.util.Scanner;

public class oop2_courseWork_1_Obj {
	Scanner courseStr = new Scanner(System.in);
	Scanner enteredDetails = new Scanner(System.in);
	String firstName,lastName;
	String stuCourse = null;
	java.util.ArrayList<String> stuCourses = new java.util.ArrayList<String>();
	int stuMark = 0;
	java.util.ArrayList<Integer> stuMarks = new java.util.ArrayList<Integer>();
	java.util.ArrayList<String> gpArr = new java.util.ArrayList<String>();
	ArrayList<String> list = new ArrayList<String>();
	String[] grade;
	java.text.DecimalFormat df = new java.text.DecimalFormat("#.0");
	
	void printName() {
		System.out.println("Enter Student Details: ");
		System.out.print("FirstName: ");
		firstName = courseStr.next();
		System.out.print("LastName: ");
		lastName = courseStr.next();
	}
	void marks() {
		for (int i = 0; i <= 5; i++) {
			System.out.print("Enter student course " + (i+1) + ": ");
			stuCourse = enteredDetails.next();
			stuCourses.add(stuCourse); 
			System.out.print("Enter " + stuCourses.get(i) + " marks: ");
			stuMark = enteredDetails.nextInt();
			stuMarks.add(stuMark);
			if (stuMarks.get(i) < 0 || stuMarks.get(i) > 100) {
				stuMarks.remove(i);
				System.out.println("Invalid mark!!!" + '\n' + "Mark is between 0 and 100" + '\n' + "Enter mark Again:");
				stuMark = enteredDetails.nextInt();
				stuMarks.add(i,stuMark);
			}
			
		}
	}
	void PrintingOut() {
		
		float gp = 0;
		int i;
		for (i = 0; i < stuMarks.size(); i++) {
			if (stuMarks.get(i) >= 85 && stuMarks.get(i) <= 100 ) {
				gp += 5.0;
				gpArr.add("5.0");
				list.add(i,"A");
			} else if (stuMarks.get(i) <= 84 && stuMarks.get(i) >= 75) {
				gp += 4.5;
				gpArr.add(i,"4.5");
				list.add(i,"B");
			} else if (stuMarks.get(i) <= 74 && stuMarks.get(i) >= 65) {
				gp += 4.0;
				gpArr.add(i,"4.0");
				list.add(i,"C");
				
			} else if (stuMarks.get(i) <= 64 && stuMarks.get(i) >= 55) {
				gp += 3.5;
				gpArr.add(i,"3.5");
				list.add(i,"D");
			} else if (stuMarks.get(i) <= 54 && stuMarks.get(i) >= 45) {
				gp += 3.0;
				gpArr.add(i,"3.0");
				list.add(i,"E");
			} else if (stuMarks.get(i) <= 44 && stuMarks.get(i) >= 35) {
				gp += 2.5;
				gpArr.add(i, "2.5");
				list.add(i,"F");
			} else if (stuMarks.get(i) <= 34 && stuMarks.get(i) >= 25) {
				gp += 2.0;
				gpArr.add("2.0");
				list.add(i,"F");
			} else if (stuMarks.get(i) < 24) {
				gp += 1.5;
				gpArr.add("1.5");
				list.add(i,"U");
			} else 
				gp += 1; 
		}
		double gpa = gp / 5;
		String numberAsString = df.format(gpa);
		System.out.println("\nStudent Name: " + firstName + " " + lastName);
		System.out.println(gpArr);
		
		System.out.println("Student Course: "  + " *** " + "Student Marks: " + " *** " + "Student Grades: " + "***" + " Student GP:");
		for (int j = 0; j <= 5; j++) {
			System.out.println(stuCourses.get(j) + "                   " + stuMarks.get(j) + "                   " + list.get(j) + "                   " + gpArr.get(j));
		}
		System.out.println("Total GP: " + gp);
		System.out.println("Total GPA: " + numberAsString);
	}
	
}
