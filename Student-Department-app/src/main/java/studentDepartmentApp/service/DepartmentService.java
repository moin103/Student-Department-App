package studentDepartmentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentDepartmentApp.model.Department;
import studentDepartmentApp.model.Student;
import studentDepartmentApp.repository.DepartmentRepository;
import studentDepartmentApp.repository.StudentRepository;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
		
	}
	public void addDepartment(Department department) {
		departmentRepository.save(department);	
		
	}

}
