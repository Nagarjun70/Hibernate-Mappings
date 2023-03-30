package com.jsp.my;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainPersonCab 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Person person1=new Person();
		person1.setName("Arjun");
		person1.setPhno(9148623670l);
		
		Person person2=new Person();
		person2.setName("Abhi");
		person2.setPhno(9148623671l);
		
		Person person3=new Person();
		person3.setName("Aryaa");
		person3.setPhno(9148623672l);
		
		Cab cab1=new Cab();
		cab1.setDname("arun");
		cab1.setCost(100);
		
		Cab cab2=new Cab();
		cab2.setDname("manoj");
		cab2.setCost(80);
		
		Cab cab3=new Cab();
		cab3.setDname("pritam");
		cab3.setCost(90);
		
		Cab cab4=new Cab();
		cab4.setDname("vaun");
		cab4.setCost(70);
		
		List<Cab> list=new ArrayList<Cab>();
		list.add(cab1);
		list.add(cab2);
		
		List<Cab>list1=new ArrayList<Cab>();
		list1.add(cab3);
		list1.add(cab4);
		
		
		person1.setCabs(list);
		person2.setCabs(list1);
		person3.setCabs(list1);
		
		entityTransaction.begin();
		
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.persist(cab4);
		entityManager.persist(cab3);
		entityManager.persist(cab2);
		entityManager.persist(cab1);
		
		entityTransaction.commit();
		
	}

}
