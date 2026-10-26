package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.tka.entity.EmplyeeEntity;

public class EmployeeDao {

	public void hqlInsert(EmplyeeEntity he) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmplyeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		String hql = "INSERT INTO EmplyeeEntity (id, name,city, age) VALUES (:id, :name,:city, :age)";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("id", he.getId());
		mq.setParameter("name", he.getName());
		mq.setParameter("city", he.getCity());
		mq.setParameter("age", he.getAge());

		mq.executeUpdate();
		t.commit();
		ss.close();
		System.out.println("Inserted");
	}
}
