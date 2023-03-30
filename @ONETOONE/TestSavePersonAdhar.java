package com.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAdhar 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("ARJUN");
		person.setAge(24);
		person.setGender("Male");
		person.setPhno(9148623670l);
		
		Person person1=new Person();
		person1.setName("ARYAA");
		person1.setAge(26);
		person1.setGender("Male");
		person1.setPhno(9148623671l);
		
		AdharCard adharCard=new AdharCard();
		adharCard.setId(123456);
		adharCard.setAddress("HUBLI");
		
		AdharCard adharCard1=new AdharCard();
		adharCard1.setId(127756);
		adharCard1.setAddress("HUBLI");
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(adharCard);
		entityManager.persist(adharCard1);
		entityTransaction.commit();
		
	
		
		
		
	}

}
