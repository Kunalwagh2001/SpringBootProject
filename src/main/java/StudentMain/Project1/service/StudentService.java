package StudentMain.Project1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import StudentMain.Project1.entity.Student;

@Service
public interface StudentService {

	List<Student> getAllStudent();

	Student getById(long id);

	

	

	Student addNewStudent(Student std);

	Object modifyById(long id, Student std);

	void DeleteById(long id);


	

}
