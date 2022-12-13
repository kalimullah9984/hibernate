package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		//creating object of question
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java?");
		
		//create object of answer
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAnswer("java is a programming language");
		q1.setAnswer(ans);
		
		//session
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		//save
		session.save(q1);
		session.save(ans);
		tx.commit();
		session.close();
      factory.close();
	}
}
