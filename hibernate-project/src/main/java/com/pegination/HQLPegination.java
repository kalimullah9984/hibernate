package com.pegination;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.easy.Student;
import java.util.*;
public class HQLPegination {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx=session.beginTransaction();
	 Query query=session.createQuery("from Student");	
	 //implementing pegination using hibernate
	 query.setFirstResult(0);
	 query.setMaxResults(3);
	 List<Student> list=query.list();
	 for(Student st:list)
	 {
		System.out.println(st.getId()+":"+st.getName()+":"+st.getCity()); 
	 }
	 tx.commit();
	session.close();
	factory.close();
}
}
