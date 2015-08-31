package com.hand;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository("jdbcService")
public class JDBCService {
	//	Configuration cfg = new Configuration().configure();
	//	ServiceRegistry servise= new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
	//	SessionFactory factory = cfg.buildSessionFactory(servise);
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Short save(Customer cus){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		short cus_id = 0;
		try{
			tx = session.beginTransaction();
			cus_id = (Short)session.save(cus);
			cus_id = cus.getCustomer_id();
//			System.out.println(cus_id);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
		return cus_id;
	}

	public void findone(Customer cus){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		System.out.println("ID:"+cus.getCustomer_id());
		System.out.println("FirstName:" + cus.getFirst_name()); 
		System.out.println("LastName:" + cus.getLast_name()); 
		System.out.println("Email:" + cus.getEmail()); 
		//        System.out.println("Address:"+customer.getAddress());
		System.out.println("Create_date:"+cus.getCreate_date());
//		try{
//			tx = session.beginTransaction();
//			List cus1 = session.createQuery("FROM Customer where customer_id=22").list(); 
//			for (Iterator iterator = 
//					cus1.iterator(); iterator.hasNext();){
//				Customer customer = (Customer) iterator.next(); 
//
//			}
//			tx.commit();
//		}catch (HibernateException e) {
//			if (tx!=null) tx.rollback();
//			e.printStackTrace(); 
//		}finally {
//			session.close(); 
//		}
	}
	
	
	public void delete(short cusid){
		Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Customer cus = (Customer)session.get(Customer.class, cusid); 
	         session.delete(cus); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
	


}
