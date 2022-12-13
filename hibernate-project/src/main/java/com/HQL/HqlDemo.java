package com.HQL;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.persistence.Student;

public class HqlDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();	

	//HQL Syntax	
	 //  String query="from Student where city='gkp'";
	 //1- String query="from Student where city=:x";
	//2- String query="from Student where city=:x";
	//3- String query="from Student as session where session.city =:x and session.name=:n";
	 // Query q=session.createQuery(query);
	 // 1- q.setParameter("x", "lucknow");
	// 2- q.setParameter("x", "ahsan");
	 //3- q.setParameter("x", "lucknow");
	 // 3-q.setParameter("n", "ahsan");
	  //single-(Unique)
	   //multiple-list
	//  List<Student>list=q.list();
	//  for(Student student:list)
	  // {
		//  System.out.println(student.getId());
		 // System.out.println(student.getName());
		 // System.err.println(student.getCity());
	  // }	 
      System.out.println("......................................");
      Transaction tx=session.beginTransaction();
      //Delete query
     // Query q2=session.createQuery("delete from Student as session where session.city=:c");
    //  q2.setParameter("c", "gkp");
    // int r= q2.executeUpdate();
   //  System.out.println("deleted:");
   // System.out.println(r);
      
   //update query
  //  Query q3=session.createQuery("update Student set city=:c where name=:n");
  //  q3.setParameter("c", "lucknow");
  // q3.setParameter("n", "ahsan");
   // int r1 = q3.executeUpdate();
   // System.out.println(r1+":"+"objects updated");
     tx.commit();
     
  	session.close();
	factory.close();
}
}
