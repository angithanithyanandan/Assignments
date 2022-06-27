package org.student;

import org.department.Department;

public class Student extends Department {

	private String studentName()

	{
		return "Name is Angitha";

	}

	public void studentDept() {
		System.out.println("Department");
	}

	int studentID() {
		return 65258;
	}

	public static void main(String[] args) {

		Student obj = new Student();
		System.out.println(obj.studentName());
		obj.studentDept();
		System.out.println("Id is " + obj.studentID());
		obj.deptName();
		obj.collegeName();
		System.out.println(collegeCode());
		obj.collegeRank();

	}

}
