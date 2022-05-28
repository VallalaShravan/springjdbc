package com.springboot.SpringbootjdbcExample2.pojo;

public class Employee {
	private String name;
	private String id;
	private String location;
	private String project;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", location=" + location + ", project=" + project + "]";
	}

	

}
