package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.easy.Student;

public class SQLExample {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	Session session = factory.openSession();
	//SQL query
	String q="select* from Student";
	NativeQuery nq = session.createSQLQuery(q);
	     List<Object[]> list = nq.list();
	    for(Object[] student:list)
	    {
	   // System.out.println(Arrays.deepToString(student));
	      System.out.println(student[1]+":"+student[2]+":"+student[0]);
	    }
	session.close();
	factory.close();
}
}
