package org.student;

import org.department.Department;

public class Student extends Department  {
	
	public void studentName() {
		System.out.println("Student name is Shri");

	}
	public void studentDept() {
		System.out.println("Department is Chem");

	}
	
	public void studentId() {
		System.out.println("994898090");

	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeName();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
