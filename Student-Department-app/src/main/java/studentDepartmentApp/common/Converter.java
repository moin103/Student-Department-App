package studentDepartmentApp.common;

import java.util.ArrayList;
import java.util.List;

import studentDepartmentApp.model.Student;
import studentDepartmentApp.vm.StudentVM;


public class Converter {
	
	public static List<StudentVM> getStudentVMList(List<Student> students) {
		List<StudentVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVM(student));
		});
		return studentVMList;
		
	}

	private static StudentVM getStudentVM(Student student) {
		if(student!=null) {
		return new StudentVM(student.getId(),student.getName(),student.getDepartment());
		}
		return null;
	}
	
}
