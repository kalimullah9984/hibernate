package com.cascade;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lazy.Answer;
import com.lazy.Question;

public class CascadingExample {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	
	Question q1 = new Question();
	q1.setQuestionId(650);
	q1.setQuestion("what is swing framework.....");
	
	 
	Answer a1 = new Answer(440,"used for development");
	Answer a2 = new Answer(441,"programmer");
	Answer a3 = new Answer(442,"laptop");
	        ArrayList<Answer> list=new ArrayList<Answer>();
	        list.add(a1);
	        list.add(a2);
	        list.add(a3);
	        q1.setAnswers(list);
	        Transaction tx = session.beginTransaction();
	        session.save(q1);
	        //in case of cascading we don,t need to save the answers it saves automatically
			/*
			 * session.save(a1); 
			 * session.save(a2);
			 *  session.save(a3);
			 */
	        tx.commit();
	session.close();	
	factory.close();
}
}
