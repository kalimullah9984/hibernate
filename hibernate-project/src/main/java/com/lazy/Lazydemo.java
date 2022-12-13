package com.lazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lazydemo {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    //creating Question
    Question q1=new Question();
    q1.setQuestionId(1111);
    q1.setQuestion("what is machine");
    
    //creating Answer
    Answer ans = new Answer();
    ans.setAnswerId(451);
    ans.setAnswer("save the time");
    ans.setQuestion(q1);
    
    Answer ans1 = new Answer();
    ans1.setAnswerId(91);
    ans1.setAnswer("save efficiency");
    ans1.setQuestion(q1);
    
    Answer ans2 = new Answer();
    ans2.setAnswerId(332);
    ans2.setAnswer("easy to work");
    ans2.setQuestion(q1);
    ArrayList<Answer> list=new ArrayList<Answer>();
    list.add(ans);
    list.add(ans1);
    list.add(ans2);
    q1.setAnswers(list);
    //session
    Session session=factory.openSession();
    Transaction tx=session.beginTransaction();
    //save
    session.save(q1);
    session.save(ans);
    session.save(ans1);
    session.save(ans2);
    Question q=(Question)session.get(Question.class,1111);
    System.out.println(q.getQuestionId());
    System.out.println(q.getQuestion());
    //by default lazy loading automatically acted,but eager loading not 
    //lazy loading
	/* System.out.println(q.getAnswers().size()); */
    /*System.out.println(q.getQuestion());
    for(Answer a:q.getAnswers()) {
    System.out.println(a.getAnswer());*/
    tx.commit();
    
    //how to execute join query
    Query q4=session.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
    List<Object []> list4=q4.getResultList();
     for(Object[] arr:list4)
    {
    	 System.out.println(Arrays.toString(arr));
     }     
   
    session.close();
    factory.close();
    }
	}

