package com.jsp.mobile;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobile 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jayanth1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Mobile mobile=new Mobile();
		mobile.setBrand("Redmi");
		mobile.setCost(25000);
		mobile.setColour("blue");
		mobile.setRam("6gb");

		Mobile mobile1=new Mobile();
		mobile1.setBrand("samsung");
		mobile1.setCost(15000);
		mobile1.setColour("black");
		mobile1.setRam("4gb");

		Sim sim=new Sim();
		sim.setProvider("AIRTEL");
		sim.setType("4G");
		sim.setCost(666);
		sim.setPhno(928282802l);

		Sim sim1=new Sim();
		sim1.setProvider("BSNL");
		sim1.setType("3G");
		sim1.setCost(466);
		sim1.setPhno(928752802l);

		Sim sim3=new Sim();
		sim3.setProvider("JIO");
		sim3.setType("4G");
		sim3.setCost(999);
		sim3.setPhno(928687802l);

		Sim sim4=new Sim();
		sim4.setProvider("VI");
		sim4.setType("3G");
		sim4.setCost(333);
		sim4.setPhno(632282802l);

		List<Sim> list=new ArrayList<Sim>();
		list.add(sim);
		list.add(sim1);
		
		List<Sim> list1=new ArrayList<Sim>();
		list1.add(sim3);
		list1.add(sim4);
		
		mobile.setSims(list1);
		mobile1.setSims(list);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(mobile1);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityManager.persist(sim3);
		entityManager.persist(sim4);
		entityTransaction.commit();
	}
}