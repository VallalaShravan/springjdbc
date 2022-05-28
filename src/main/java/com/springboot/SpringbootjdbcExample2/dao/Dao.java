package com.springboot.SpringbootjdbcExample2.dao;

import java.util.List;

import com.springboot.SpringbootjdbcExample2.pojo.Employee;

public interface Dao {
	List<Employee> findAll();
	Employee findOne(String id);
	int update(Employee emp);
	int updateWithPreparedStatementSetter(Employee emp);

}
