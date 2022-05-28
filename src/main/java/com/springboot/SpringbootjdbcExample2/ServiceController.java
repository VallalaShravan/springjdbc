package com.springboot.SpringbootjdbcExample2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringbootjdbcExample2.dao.DaoController;
import com.springboot.SpringbootjdbcExample2.pojo.Employee;
import com.springboot.SpringbootjdbcExample2.service.ServiceInterface;
@Service
public class ServiceController implements ServiceInterface {
	@Autowired
	public DaoController dao;
	@Override
	public List<Employee> findAll() {
		System.out.println("before returning Service");
		return dao.findAll();
	}
	@Override 
	public Employee findOne(String id) {
		return dao.findOne(id);
	}
	@Override
	public int update(Employee emp) {
		
		return dao.update(emp);
	}

}
