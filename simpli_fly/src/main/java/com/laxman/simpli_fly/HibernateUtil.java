package com.laxman.simpli_fly;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	 
	static {
 
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
 
		Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
 
		sessionFactory =  (SessionFactory) metaData.getSessionFactoryBuilder().build();
 
	}

	public static SessionFactory getSessionFactory() {
			return sessionFactory;
	}
}
