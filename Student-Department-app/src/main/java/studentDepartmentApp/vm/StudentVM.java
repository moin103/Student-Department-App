package studentDepartmentApp.vm;

import java.io.Serializable;
import java.util.List;

import studentDepartmentApp.model.Department;

public class StudentVM implements Serializable{
	String id;
	String name;
	Department department;
	//List<CourseVM> course;

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public StudentVM() {
		super();
	// TODO Auto-generated constructor stub
	}
	public StudentVM(String id, String name,Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}



 
}
