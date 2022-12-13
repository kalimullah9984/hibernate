package com.maven;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
       Configuration conf = new Configuration();
       conf.configure("hibernate.cfg.xml");
       SessionFactory factory=conf.buildSessionFactory();
       
       Test test = new Test();
       test.setId(101);
       test.setName("Obaid");
       Address add = new Address();
       add.setStreet("street");
       add.setCity("Agra");
       add.setOpen(true);
       add.setX(12344.5432);
       //Reading Image
       FileInputStream fis= new FileInputStream("src/main/java/image.jpg.jpg");
       byte[] data=new byte[fis.available()];
       fis.read(data);
       add.setImage(data);
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction(); 
       
       
       session.save(test);
       session.save(add);
       tx.commit();
       session.close();
       factory.close();
       System.out.println("done");
    }
}
