package net.agency.controller;

import java.util.List;

import net.agency.model.Driver;
import net.agency.util.HibernateUtil;


import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

public class DriverManager {
	public Driver add(Driver aDriver) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(aDriver);
		session.getTransaction().commit();
		return aDriver;
	}
	public Driver delete(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Driver aDriver = (Driver) session.load(Driver.class, id);
		if(null != aDriver) {
			session.delete(aDriver);
		}
		session.getTransaction().commit();
		return aDriver;
	}

	public List<Driver> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Driver> aDrivers = null;
		try {
			
			aDrivers = (List<Driver>)session.createQuery("from Driver").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return aDrivers;
	}
}
