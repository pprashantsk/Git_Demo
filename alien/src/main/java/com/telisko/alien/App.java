package com.telisko.alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien psk = new Alien();
        psk.setaId(124);
        psk.setAcolour("green");
        psk.setaName("psk");
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.getCurrentSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(psk);
        
        tx.commit();
    }
}
