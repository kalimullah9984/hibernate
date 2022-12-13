package com.onetomanyandmanytoone;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();		
		
		  //creating object of question
			
			  Question q1=new Question();
			  q1.setQuestionId(76526);
			  q1.setQuestion("what is java?");
			  
			  //create object of answer 
			  Answer ans = new Answer(); ans.setAnswerId(343);
			  ans.setAnswer("java is a programming language"); 
			  ans.setQuestion(q1);
			  
			  Answer ans1 = new Answer(); ans1.setAnswerId(391);
			  ans1.setAnswer("java is platform independent"); 
			  ans1.setQuestion(q1);
			  
			  Answer ans2 = new Answer(); ans2.setAnswerId(363);
			  ans2.setAnswer("java is a secure");
			  ans2.setQuestion(q1);
			  //list
			  List<Answer>list=new ArrayList<Answer>();
			  list.add(ans); 
			  list.add(ans1);
			  list.add(ans2); 
			  q1.setAnswers(list);
			 
		  //session
		 		  
		  Session session = factory.openSession();
		 
		  Transaction tx =  session.beginTransaction();
		  
		  // save		  
		  session.save(q1); session.save(ans); session.save(ans1); session.save(ans2);
			
		  Question q = (Question) session.get(Question.class, 76526);
		  System.out.println(q.getQuestion()); for (Answer a : q.getAnswers()) {
		  System.out.println(a.getAnswer()); }
	 
		tx.commit();
		System.out.println("mujeeb");
		session.close();
		factory.close();
	}
}
