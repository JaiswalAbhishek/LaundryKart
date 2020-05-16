package com.booking.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateConfiguration {

	public Session session;
	
	public HibernateConfiguration() {
		this.session=null;
	}
	
	public Session getHibernateSession() {
		Configuration config =	 new Configuration();
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		this.session = sessionFactory.openSession();
	return this.session;
	}
	public boolean closeSession() {
		this.session.close();
		if (this.session==null){
			return true;
		}
		else return false;
	}
	
}
