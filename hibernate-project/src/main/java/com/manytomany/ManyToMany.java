package com.manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class ManyToMany {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.setEid(401);
		e1.setName("kaleem");
		
		e2.setEid(402);
		e2.setName("mujeeb");
		
		Project p1=new Project();
		Project p2=new Project();
		p1.setPid(872);
		p1.setProjectName("solar energy system");
		p2.setPid(873);
		p2.setProjectName("gas pipeline system");
		ArrayList<Emp>list1=new ArrayList<Emp>();
		ArrayList<Project>list2=new ArrayList<Project>();
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		e1.setProjects(list2);
		p2.setEmps(list1);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		tx.commit();
		session.close();
       factory.close();
	}

}
