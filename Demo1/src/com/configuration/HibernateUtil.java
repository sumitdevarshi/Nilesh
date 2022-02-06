package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionfactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory==null)
		{
			registry=new StandardServiceRegistryBuilder().configure("com/model/hibernate.cfg.xml").build();
			MetadataSources mds=new MetadataSources(registry);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sessionfactory=md.getSessionFactoryBuilder().build();
			
		}
		return sessionfactory;
	}
	
	

}
