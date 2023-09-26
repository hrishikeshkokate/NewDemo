package objectclass;

import java.util.Scanner;

public class StudentInput {
	int stid;
	String name;
	float marks1;
	float marks2;
	float marks3;
	float per;
	char grade;

	void calPercentage() {
		per = ((marks1 + marks2 + marks3) / 3);
	}

	void calGrade() {
		if (per >= 90)
			grade = 'A';
		else if (per >= 80)
			grade = 'B';
		else if (per >= 60)
			grade = 'C';
		else if (per >= 40)
			grade = 'D';
		else
			grade = 'F';
	}

	void display() {
		System.out.println("Id:" + stid + " name :" + name + " Percentage:" + per + "%");
		if (grade == 'F')
			System.out.println("You have failed......");
		else
			System.out.println("Congratulations!!..You have passed");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInput s1 = new StudentInput();

		System.out.println("Enter student id :");
		s1.stid = sc.nextInt();

		System.out.println("Enter student name :");
		s1.name = sc.next();

		System.out.println("Marks of subject 1 :");
		s1.marks1 = sc.nextInt();

		System.out.println("Marks of subject 2 :");
		s1.marks2 = sc.nextInt();

		System.out.println("Marks of subject 3 :");
		s1.marks3 = sc.nextInt();

		System.out.println("===============================");
		s1.calPercentage();
		s1.calGrade();
		s1.display();
		
       
	}

}
