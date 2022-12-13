package com.persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class States {
	public static void main(String[] args) {
	//practical of hibernate objects states:
		//Transient State
		//Persistence State
		//Detached State
		//Removed State
System.out.println("example");
SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//creating student object
Student st = new Student();
st.setId(348);
st.setName("pope");
st.setCity("lucknow");
st.setCerti(new Certificate("MBBS","4 year"));
//student Transient state
Session session=f.openSession();

session.save(st);
st.setName("ahsan");
//student:Persistence

session.close();
//Student Detached
st.setName("babu");
System.out.println(st);
f.close();
}
}
