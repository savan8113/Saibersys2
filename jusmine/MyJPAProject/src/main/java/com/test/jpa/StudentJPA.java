package com.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.test.pojo.Student;

public class StudentJPA {
	
	public static void main(String args[]){
		
		
		EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("student-example");
		EntityManager emManager= emFactory.createEntityManager();
		
		EntityTransaction eTransaction= emManager.getTransaction();
		
		eTransaction.begin();
		
		Student student= emManager.find(Student.class,1);
		
		System.out.println(student.getSno());
		System.out.println(student.getSname());
		
		Student student2= new Student(3, "rajeev", "Maddipati", "CS");
		emManager.persist(student2);
		
		
		eTransaction.commit();
		
	}
	
	
	
	
	

}
