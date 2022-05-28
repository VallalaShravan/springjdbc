package com.springboot.SpringbootjdbcExample2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.SpringbootjdbcExample2.pojo.Employee;

@SpringBootApplication
public class SpringbootJdbcExample2Application  implements CommandLineRunner{
	@Autowired
	public ServiceController serviceInfo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcExample2Application.class, args);
		System.out.println("Configuration Completed");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method");
		List<Employee> list = serviceInfo.findAll();
		System.out.println("data retrived");
		System.out.println(list);
		System.out.println("with Query Object referance ");
		System.out.println(serviceInfo.findOne("SHRAVAN"));
		Employee emp = new Employee();
		emp.setId("UNKNOWN");
		emp.setName("ANIMUTHYAM");
		emp.setLocation("HYDERABAD");
		emp.setProject("JAVA");
		int x = serviceInfo.update(emp);
		System.out.println("x value is : "+x+" no f rows executed");
		
	}

}
