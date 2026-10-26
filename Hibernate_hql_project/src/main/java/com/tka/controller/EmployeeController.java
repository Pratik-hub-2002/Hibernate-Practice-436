package com.tka.controller;

import com.tka.entity.EmplyeeEntity;
import com.tka.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();

		EmplyeeEntity ee = new EmplyeeEntity();
		ee.setId(140);
		ee.setName("Arjun");
		ee.setCity("Chh Sambhjinagar");
		ee.setAge(24);
		
		es.insertData(ee);
	}
}
