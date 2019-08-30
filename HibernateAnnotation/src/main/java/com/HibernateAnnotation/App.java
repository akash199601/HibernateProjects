package com.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        
        
        Student stud=new Student();
        stud.setRollNo(1);
        stud.setName("Bhanoo Singh2");
        stud.setEmail("bhanoo@gmail.com");
        
        session.saveOrUpdate(stud);
        
        System.out.println("Done !");
        session.getTransaction().commit();
        session.close();
    }
}
