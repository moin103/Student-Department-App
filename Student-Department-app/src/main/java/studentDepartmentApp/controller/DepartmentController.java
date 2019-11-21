package studentDepartmentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import studentDepartmentApp.model.Department;
import studentDepartmentApp.model.Student;
import studentDepartmentApp.service.DepartmentService;
import studentDepartmentApp.service.StudentService;
import studentDepartmentApp.vm.StudentVM;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);

	}
}
