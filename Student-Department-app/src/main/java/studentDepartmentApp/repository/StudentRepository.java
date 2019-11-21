package studentDepartmentApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import studentDepartmentApp.model.Student;
//
public interface StudentRepository extends JpaRepository<Student, String> {

//	
}
