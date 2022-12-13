package com.hiberprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Officer off = new Officer();
       off.setId(61);
       off.setName("ahsan");
       off.setCity("Jaunpur");
       Certificate certificate = new Certificate();
       certificate.setCourse("B.Tech");
       certificate.setDuration("4 year");
       off.setCerti(certificate);
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(off);
       tx.commit();
       session.close();
       factory.close();
	}

}
