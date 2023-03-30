package com.jsp.BDA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Gstcontroller 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Company company=new Company();
//		company.setName("wipro");
//		company.setWebsite("www.wipro.com");
//		company.setLocation("bengalore");
//		 
//		Company company1=new Company();
//		company1.setName("sonata");
//		company1.setWebsite("www.sonata.com");
//		company1.setLocation("rr nagar");
//		
//		GST gst=new GST();
//		gst.setGstno("wip1023");
//		gst.setState("karnataka");
//		gst.setCountry("india");
//
//		GST gst1=new GST();
//		gst1.setGstno("son342");
//		gst1.setState("karnataka");
//		gst1.setCountry("india");
//		
//		company.setGst(gst); //one to one mapping
//		company1.setGst(gst1);
//		gst.setCompany(company);
//		gst1.setCompany(company1);
//		
//		entityTransaction.begin();
//		entityManager.persist(company);
//		entityManager.persist(company1);
//		entityManager.persist(gst);
//		entityManager.persist(gst1);
//		entityTransaction.commit();
		
		Company company=entityManager.find(Company.class,1);
		System.out.println(company);
	}

}


