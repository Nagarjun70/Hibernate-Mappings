package com.jsp.MNYTOMNY;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainStudent 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Student student1=new Student();
		student1.setName("ARJUN");
		student1.setPhno(9148623670l);
		student1.setMarks(99);
		student1.setAge(25);

		Student student2=new Student();
		student2.setName("SHIVA");
		student2.setPhno(9148623671l);
		student2.setMarks(89);
		student2.setAge(28);

		Student student3=new Student();
		student3.setName("ABHI");
		student3.setPhno(917823671l);
		student3.setMarks(79);
		student3.setAge(22);

		Student student4=new Student();
		student4.setName("ARYAA");
		student4.setPhno(9999723671l);
		student4.setMarks(90);
		student4.setAge(28);


		Course course1=new Course();
		course1.setName("Engineering");
		course1.setFees(50000);
		course1.setTrainer("FAizen Bhai");

		Course course2=new Course();
		course2.setName("MBBS");
		course2.setFees(500000);
		course2.setTrainer("Sharuk khan");

		Course course3=new Course();
		course3.setName("AI and ML");
		course3.setFees(45000);
		course3.setTrainer("ARjun");

		Course course4=new Course();
		course4.setName("Cyber Security");
		course4.setFees(89000);
		course4.setTrainer("shivaaa");


		List<Course> list1=new ArrayList<Course>();
		list1.add(course1);
		list1.add(course2);

		List<Course> list2=new ArrayList<Course>();
		list1.add(course3);
		list1.add(course4);

		List<Student> l3=new ArrayList<Student>();
		l3.add(student1);
		l3.add(student2);
		
		List<Student> l4=new ArrayList<Student>();
		l4.add(student3);
		l4.add(student4);
		
		student1.setCourse(list1);
		course1.setStudent(l3);
		course2.setStudent(l3);
		
		student2.setCourse(list1);
		course1.setStudent(l3);
		course2.setStudent(l3);
		
		
		Student student=entityManager.find(Student.class,1);
		student.setMarks(94);
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		entityManager.persist(student);
		entityTransaction.commit();

		
		System.out.println("1----------------------");
		List<Student> st=new ArrayList<Student>();
		st.add(student);
		st.add(student1);
		st.add(student2);
		st.add(student3);
		st.add(student4);
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		System.out.println("2-------------------");
		
		List<Student> st1=new ArrayList<Student>();
		st1.add(student);
		st1.add(student1);
		st1.add(student2);
		st1.add(student3);
		st1.add(student4);
		
		for(Student s:st1)
		{
			if(student1.getMarks()>50&&student1.getAge()>20)
				System.out.println(st1);
			
		}
		
		System.out.println("3-------------------");
		List<Course> st2=new ArrayList<Course>();
		st2.add(course1);
		st2.add(course2);
		st2.add(course3);
		st2.add(course4);
		
		
		for(Course s:st2)
		{
			if(s.getFees()>35000)
				System.out.println(s);
			
		}
		
		
		
		

	}

}










