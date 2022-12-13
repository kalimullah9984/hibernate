package com.secondcache;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.system.Student;

public class SecondCacheExample {
public static void main(String[] args) {
  	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  	           Session session1 = factory.openSession();
  	           //first
  	           Student st = session1.get(Student.class,591);
  	           System.out.println(st);
  	           session1.close();
  	           System.out.println("kaleem");
  	           	           
  	         Session session2 = factory.openSession();
  	         //second
  	       Student st1 = session2.get(Student.class,591);
	           System.out.println(st1);
  	         session2.close();
  	        
}
}
