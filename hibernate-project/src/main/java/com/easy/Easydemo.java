package com.easy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Easydemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Student s = new Student();
		s.setId(321);
		s.setName("rakesh");
		s.setCity("manglore");
		
		Student s1 = new Student();
        s1.setId(322);
        s1.setName("abhisekh");
        s1.setCity("indore");
        
        Student s2 = new Student();
        s2.setId(323);
        s2.setName("lovekush");
        s2.setCity("chandigarh");
        Transaction tx =session.beginTransaction();
        session.save(s);
        session.save(s1);
        session.save(s2);
        tx.commit();
        session.close();
        factory.close();
	}

}
