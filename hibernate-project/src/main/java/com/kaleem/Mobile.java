package com.kaleem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mobile {

	public static void main(String[] args) {
		
	System.out.println("program started");
	Laptop lp= new Laptop();
	lp.setId(12);
	lp.setName("Rock");
	lp.setCity("Delhi");
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(lp);
	tx.commit();
	session.close();
	factory.close();

	}

}
