package studentDepartmentApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {
	

	private String id;
	@Id
	private String name;
	
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
	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
