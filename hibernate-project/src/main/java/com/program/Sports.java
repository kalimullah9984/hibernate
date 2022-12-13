package com.program;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Sports {
	public static void main(String[] args) {
		        System.out.println( "Hello World!" );
		       Configuration conf = new Configuration();
		       conf.configure("hibernate.cfg.xml");
		       SessionFactory factory=conf.buildSessionFactory();
		       
		        Art art = new Art();
		        art.setStreet("street");
		        art.setCity("Agra");
		        art.setOpen(true);
		        art.setAddeDate(new Date());
		        art.setX(12344.5432);
		       Session session=factory.openSession();
		       Transaction tx=session.beginTransaction(); 
		      	       
		       session.save(art);      
		       tx.commit();
		       session.close();
		       factory.close();
		       System.out.println("done");
		    }
}


