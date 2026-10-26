package com.tka.service;

import com.tka.dao.Employeedao;
import com.tka.entity.EmployeeEntity;

public class EmployeeService {

	Employeedao ed = new Employeedao();

	public void insertData(EmployeeEntity e) {
		ed.insertData(e);
	}

	public void updateData(EmployeeEntity ee) {
		ed.updateData(ee);
	}

	public void deleteData(int id) {
		ed.deleteData(id);
	}

	public void fetchData(int id) {
		ed.fetchData(id);
	}

	public void fetchallData() {
		ed.fetchallData();
	}
}
