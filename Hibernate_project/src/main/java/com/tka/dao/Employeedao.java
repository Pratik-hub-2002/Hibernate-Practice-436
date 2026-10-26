package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.EmployeeEntity;

public class Employeedao {

	public void insertData(EmployeeEntity e) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(EmployeeEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity ee = new EmployeeEntity();
		ee.setId(e.getId());
		ee.setName(e.getName());
		ee.setCity(e.getCity());
		ee.setAge(e.getAge());

		ss.persist(ee);
		t.commit();
		ss.close();
		System.out.println("Data Inserted");
	}

	public void updateData(EmployeeEntity ee) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity et = ss.get(EmployeeEntity.class, ee.getId());

		et.setName(ee.getName());
		et.setCity(ee.getCity());
		et.setAge(ee.getAge());

		ss.merge(et);
		t.commit();
		ss.close();
		System.out.println("Updated");
	}

	public void deleteData(int id) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity ent = ss.get(EmployeeEntity.class, id);
		ss.remove(ent);
		t.commit();
		ss.close();
		System.out.println("Deleted");
	}

	public void fetchData(int id) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity ent = ss.get(EmployeeEntity.class, id);
		System.out.println(ent);
	}

	public void fetchallData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		String hql = "from EmployeeEntity";
		Query<EmployeeEntity> q = ss.createQuery(hql, EmployeeEntity.class);
		List<EmployeeEntity> list = q.getResultList();
		System.out.println(list);

	}

	public void hqlInsert(EmployeeEntity he) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity ehe = new EmployeeEntity();
	}
}
