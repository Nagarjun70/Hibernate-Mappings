package com.jsp.OMMOBii;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class bankcontroller 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Person person=new Person();
//		person.setName("ARJUN");
//		person.setPhno(9148623670l);
//		person.setGender("male");
//		
//		Person person1=new Person();
//		person1.setName("ARYAA");
//		person1.setPhno(9148623671l);
//		person1.setGender("male");
//		
//		Person person2=new Person();
//		person2.setName("SHIVAA");
//		person2.setPhno(99986526774l);
//		person2.setGender("male");
//		
//		Bank bank=new Bank();
//		bank.setBankname("SBI");
//		bank.setLocation("SHIGGON");
//		bank.setPhno(9282827222l);
//		bank.setIfsc("SBINO012704");
//		
//		Bank bank1=new Bank();
//		bank1.setBankname("CANERA");
//		bank1.setLocation("HUBLI");
//		bank1.setPhno(927117181101l);
//		bank1.setIfsc("CANERA0987295");
//		
//		Bank bank2=new Bank();
//		bank2.setBankname("AIXIS");
//		bank2.setLocation("myysore");
//		bank2.setPhno(92711718l);
//		bank2.setIfsc("AXIS0981395");
//		
//		Bank bank3=new Bank();
//		bank3.setBankname("BARODA");
//		bank3.setLocation("bengalore");
//		bank3.setPhno(927123424l);
//		bank3.setIfsc("BARODA0987295");
//		
//		List<Bank> list1=new ArrayList();
//		list1.add(bank);
//		list1.add(bank1);
//		
//		List<Bank> list2=new ArrayList();
//		list2.add(bank2);
//		list2.add(bank3);
//		
//		person.setList(list1);
//		bank.setPerson(person);
//		bank1.setPerson(person);
//		
//		person1.setList(list2);
//		bank2.setPerson(person1);
//		bank3.setPerson(person1);
//		
//	    entityTransaction.begin();
//	    entityManager.persist(person);
//	    entityManager.persist(person1);
//	    entityManager.persist(person2);
//	    entityManager.persist(bank);
//	    entityManager.persist(bank1);
//	    entityManager.persist(bank2);
//	    entityManager.persist(bank3);
//	    entityTransaction.commit();
		
		Bank bank=entityManager.find(Bank.class,1);
		System.out.println(bank);
	}

}
