package com.hiber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Fetch_Demo {

	public static void main(String[] args) {	
   Configuration cfg = new Configuration();
   cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
	/*
	 * Employee emp = new Employee();
	 * 
	 * emp.setId(31); emp.setName("arjun"); emp.setDob(1995);
	 * 
	 */
    Transaction tx=session.beginTransaction(); 
    //get method used to fetch data
	  Employee emp1=(Employee)session.get(Employee.class, 31);
	  System.out.println(emp1.getId());
	  System.out.println(emp1.getName());
	  //load method also used for to fetch data
	  Employee emp2=(Employee)session.load(Employee.class, 1);    
	 	System.out.println(emp2);
		 // session.save(emp); 
		  tx.commit();
		 
    session.close();
    factory.close();
	}

}
