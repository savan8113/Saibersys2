package com.test.jpa;

import com.test.dao.StudentDAO;
import com.test.pojo.Student;

public class StudentDAOJPA {

	public static void main(String[] args) {
		
		StudentDAO studentDAO= new StudentDAO();
		
		Student student1= new Student(4, "Ram", "Santosh", "IA");
//		studentDAO.saveStudent(student1);
		
		
		System.out.println(studentDAO.getAllStudents().toString());
		
		System.out.println(studentDAO.getBySname("savanth"));

	}

}
