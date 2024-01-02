package com.jp.pj.student;

import java.util.Scanner;

public class StudentApp {
	static {
		System.out.println("Welcome to Student app");
		System.out.println("______________________");
	}
	static StudentLogic logic = new StudentLogic();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		selectOption(sc);
		sc.close();
		System.out.println("Thank you...");
	}

	private static void selectOption(Scanner sc) {
		boolean repeat = true;
		while (repeat) {
			try {
				System.out.println("________________");
				System.out.println("Select an Option");
				System.out.println("________________");
				System.out.println("1)Add Student");
				System.out.println("2)Student Lis");
				System.out.println("3)Search Student");
				System.out.println("4)Delete Student");
				System.out.println("5)Exit Student App");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println("________________");
				switch (choice) {
				case 1:
					addStudent(sc);
					break;
				case 2:
					logic.display();
					break;
				case 3:
					searchStudent(sc);
					break;
				case 4:
					deleteStudent(sc);
					break;
				case 5:
					repeat = false;
					break;
				default:
					System.err.println("Invalid Selection");
				}
			} catch (Exception e) {
				System.err.println("Invalid Input");
				sc.nextLine();
			}
		}
	}
	private static void addStudent(Scanner sc) {
		if (logic.getCount() < logic.students.length) {
			System.out.println("Enter student id");
			int sid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student name");
			String name = sc.nextLine();
			System.out.println("Enter student phone");
			long phone = sc.nextLong();
			logic.addStudent(new Student(sid, name, phone));
		} else {
			System.err.println("Studnet DataBase is full");
		}
	}
	private static void searchStudent(Scanner sc) {
		if (logic.getCount() != 0) {
			boolean repeat = true;
			while (repeat) {
				try {
					System.out.println("________________");
					System.out.println("Select an Option");
					System.out.println("________________");
					System.out.println("1)Search Student By Id");
					System.out.println("2)Search Student By name");
					System.out.println("3)Search Student By phone");
					System.out.println("4)Retun to Home page");
					int choice = sc.nextInt();
					sc.nextLine();
					System.out.println("________________");
					switch (choice) {
					case 1:
						System.out.println("Enter student id");
						int sid = sc.nextInt();
						logic.searchStudentById(sid);
						break;
					case 2:
						System.out.println("Enter student name");
						String name = sc.nextLine();
						logic.searchStudentByName(name);
						break;
					case 3:
						System.out.println("Enter student phone");
						long phone = sc.nextLong();
						logic.searchStudentByPhone(phone);
						break;
					case 4:
						repeat = false;
						break;
					default:
						System.err.println("Invalid Selection");
					}
				} catch (Exception e) {
					System.err.println("Invalid Input");
					sc.nextLine();
				}
			}

		} else {
			System.err.println("No Students added to Database");
		}
	}

	private static void deleteStudent(Scanner sc) {
		if (logic.getCount() != 0) {
			System.out.println("Enter student id");
			int sid = sc.nextInt();
			logic.deleteStudentById(sid);
		} else {
			System.err.println("No Students added to Database");
		}
	}
}
