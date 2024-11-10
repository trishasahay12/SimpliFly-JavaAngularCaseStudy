package com.laxman.simpli_fly;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.laxman.simpli_fly.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();

    	Session session = sessionFactory.openSession();
    }
}
