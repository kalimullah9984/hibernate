package com.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.system.Student;

public class Demo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session=factory.openSession();
			
			  Student student2 = new Student(); 
			  student2.setId(591);
			  student2.setName("hakim"); 
			  student2.setCity("bhopal");
			 
		 
			
			  Student student3 = new Student();
			  student3.setId(592);
			  student3.setName("agran");
			  student3.setCity("sitapur");
			  
			 	
			
			  Student student4 = new Student();
			  student4.setId(593);
			  student4.setName("nora");
			  student4.setCity("faizabaad");
			 
		 Transaction tx=session.beginTransaction();
			
			  session.save(student2);
			  session.save(student3); 
			  session.save(student4);
			 
		
		 tx.commit();
		 session.close();
		 

	}

}
