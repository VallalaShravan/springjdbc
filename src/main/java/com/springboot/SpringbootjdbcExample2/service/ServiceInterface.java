package com.springboot.SpringbootjdbcExample2.service;

import java.util.List;

import com.springboot.SpringbootjdbcExample2.pojo.Employee;

public interface ServiceInterface {
	List<Employee> findAll();
	Employee findOne(String id);
	int update(Employee emp);

}
