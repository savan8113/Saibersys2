package com.test.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.test.pojo.Student;

public class StudentDAO {
	
	
		EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("student-example");
	

	
	public Student getStudent(int sno)
	{
		
		EntityManager eManager= emFactory.createEntityManager();
		EntityTransaction eTransaction= eManager.getTransaction();
		
		eTransaction.begin();
		return eManager.find(Student.class, 2);
		
	}
	
	public void saveStudent(Student student)
	{
		EntityManager eManager= emFactory.createEntityManager();
		EntityTransaction eTransaction= eManager.getTransaction();
		
		eTransaction.begin();
		eManager.persist(student);
		
		eTransaction.commit();
		eManager.close();
		
	}
	
	public void deleteStudent(int sno)
	{
		EntityManager eManager= emFactory.createEntityManager();
		EntityTransaction eTransaction= eManager.getTransaction();
		
		eTransaction.begin();
		
		Student student= eManager.find(Student.class, sno);
		eManager.remove(student);
		eTransaction.commit();
		eManager.close();
	}
	
	public List<Student> getAllStudents()
	{
		EntityManager eManager= emFactory.createEntityManager();
		EntityTransaction eTransaction= eManager.getTransaction();
		
		eTransaction.begin();
		
		List<Student> studentList= eManager.createQuery("from com.test.pojo.Student").getResultList();
		return studentList;
	}
	
	public Student getBySname(String sname)
	{
		EntityManager eManager= emFactory.createEntityManager();
		EntityTransaction eTransaction= eManager.getTransaction();
		
		eTransaction.begin();
		TypedQuery<Student> query= eManager.createQuery("from com.test.pojo.Student stu where stu.sname=?", Student.class);
		
		query.setParameter(1, sname);
		return query.getSingleResult();
	}
}
