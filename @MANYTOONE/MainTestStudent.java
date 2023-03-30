package com.jsp.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTestStudent 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student1=new Student();
		student1.setName("Arjun");
		student1.setAge(24);
		student1.setMarks(99);
		student1.setGender("Male");
		
		Student student2=new Student();
		student2.setName("Abhi");
		student2.setAge(23);
		student2.setMarks(79);
		student2.setGender("Male");
		
		Student student3=new Student();
		student3.setName("ashika");
		student3.setAge(20);
		student3.setMarks(89);
		student3.setGender("Female");
		
		Student student4=new Student();
		student4.setName("Nanu");
		student4.setAge(25);
		student4.setMarks(100);
		student4.setGender("Male");
		
		College college1=new College();
		college1.setName("Karavali Institute");
		college1.setWebsite("www.Kit.com");
		college1.setLocation("Manglore");
		
		College college2=new College();
		college2.setName("Arjun Institute");
		college2.setWebsite("www.Arjun.com");
		college2.setLocation("Banglore");
		
		student1.setCollege(college1);
		student2.setCollege(college1);
		
		student3.setCollege(college2);
		student4.setCollege(college2);
		
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		entityManager.persist(college1);
		entityManager.persist(college2);
		entityTransaction.commit();
	}

}
