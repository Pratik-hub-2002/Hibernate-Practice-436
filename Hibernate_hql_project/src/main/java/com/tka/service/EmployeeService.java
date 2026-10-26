package com.tka.service;

import com.tka.dao.EmployeeDao;
import com.tka.entity.EmplyeeEntity;

public class EmployeeService {

	EmployeeDao eds = new EmployeeDao();

	public void insertData(EmplyeeEntity he) {

		eds.hqlInsert(he);
	}
}
