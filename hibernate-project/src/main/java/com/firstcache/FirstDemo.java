package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.system.Student;

public class FirstDemo {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 Session session=factory.openSession();	
		 
	 //by default enabled
	Student student=session.get(Student.class,591);
	 System.out.println(student);
	 System.out.println("welcome to my all friends");
	      Student student1=session.get(Student.class, 591);
	      System.out.println(student1);
	      //check object store in session or not it will return in boolean value
	     System.out.println( session.contains(student1));
		 session.close();
	 
    }
   }
