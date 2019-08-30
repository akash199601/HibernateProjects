package com.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stud=new Student();
        
        stud.setName("Akash");
        stud.setEmail("akash@gmail.com");
        
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        
        Session session=sf.openSession();
        
        session.beginTransaction();
        
        session.save(stud);
        
        session.getTransaction().commit();
       session.close(); 
    }
}
