package com.springboot.SpringbootjdbcExample2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.SpringbootjdbcExample2.pojo.Employee;

@Repository
public class DaoController implements Dao {
	public static final String SELECT_QUERY="SELECT * FROM EMPLOYEE";
	public static final String SELECT_QUERY2="SELECT * FROM EMPLOYEE WHERE NAME=?";
	public static final String UPDATE_QUERY="INSERT INTO EMPLOYEE(ID,NAME,LOCATION,PROJECT) VALUES (?,?,?,?)";
	
@Autowired
private JdbcTemplate template;

	@Override
	public List<Employee> findAll() {
	List<Employee> list = template.query(SELECT_QUERY, new RowMapper<Employee>() {
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setName(rs.getString(1));
			emp.setId(rs.getString(2));
			emp.setLocation(rs.getString(3));
			emp.setProject(rs.getString(4));
			return emp;
		}
	});
	System.out.println("before returning DAO");
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee findOne(String id) {
	String[] obj = new String[] {id};
	
	Employee emp =template.queryForObject(SELECT_QUERY2, obj,new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setName(rs.getString(1));
			emp.setId(rs.getString(2));
			emp.setLocation(rs.getString(3));
			emp.setProject(rs.getString(4));
			return emp;
		}
	});
		return emp;
	}

	public int update(Employee emp) {
		String[] str = new String[] {emp.getId(),emp.getName(),emp.getLocation(),emp.getProject()};
		int x=0;
		 x = template.update(UPDATE_QUERY,str);
		return x;
	}

	public int updateWithPreparedStatementSetter(Employee emp) {
		return 0;
	}

}
