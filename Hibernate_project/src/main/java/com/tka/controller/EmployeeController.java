package com.tka.controller;

import com.tka.entity.EmployeeEntity;
import com.tka.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();

		EmployeeEntity ee = new EmployeeEntity();
//		ee.setId(123);
//		ee.setName("Vilen");
//		ee.setCity("Haryana");
//		ee.setAge(24);

//		ee.setId(124);
//		ee.setName("Aarav");
//		ee.setCity("Delhi");
//		ee.setAge(28);
//		ee.setId(125);
//		ee.setName("Diya");
//		ee.setCity("Mumbai");
//		ee.setAge(22);
//		ee.setId(126);
//		ee.setName("Kabir");
//		ee.setCity("Bangalore");
//		ee.setAge(31);
//		ee.setId(127);
//		ee.setName("Ananya");
//		ee.setCity("Kolkata");
//		ee.setAge(26);
//		ee.setId(128);
//		ee.setName("Vivaan");
//		ee.setCity("Pune");
//		ee.setAge(29);
//		ee.setId(129);
//		ee.setName("Isha");
//		ee.setCity("Hyderabad");
//		ee.setAge(25);
//		ee.setId(130);
//		ee.setName("Arjun");
//		ee.setCity("Chennai");
//		ee.setAge(35);
//		ee.setId(131);
//		ee.setName("Meera");
//		ee.setCity("Ahmedabad");
//		ee.setAge(23);
//		ee.setId(132);
//		ee.setName("Rohan");
//		ee.setCity("Jaipur");
//		ee.setAge(27);

//		es.insertData(ee);

//		ee.setId(124);
//		ee.setName("Hary");
//		ee.setCity("CHH Sambhajinagar");
//		ee.setAge(23);
//		es.updateData(ee);

//		int id = 127;
//		es.deleteData(id);

//		int id = 129;
//		es.fetchData(id);

		es.fetchallData();

	}
}
