package StudentMain.Project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentMain.Project1.Exception.ResousreNotFound;
import StudentMain.Project1.entity.Student;
import StudentMain.Project1.repository.StudentRepo;

@Service
public class StudentSerImp implements StudentService{

	@Autowired
	StudentRepo stdRep;

	@Override
	public List<Student> getAllStudent() {
		return stdRep.findAll();
		
	}

	@Override
	public Student getById(long id) {
		return  stdRep.findById(id).orElseThrow(() -> new ResousreNotFound("No STudent Fount with Id "+id));
	}

	
	@Override
	public Student addNewStudent(Student std) {
		return stdRep.save(std);
	}

	@Override
	public Object modifyById(long id, Student std) {
		Student existingStudent = stdRep.findById(id).orElseThrow(()->  new ResousreNotFound("No STudent Fount with Id "+id) );
		existingStudent.setName(std.getName());
		existingStudent.setMobileno(std.getMobileno());
		return stdRep.save(existingStudent);
	}

	@Override
	public void DeleteById(long id) {
		
		Student existingStudent = stdRep.findById(id).orElseThrow(()->  new ResousreNotFound("No STudent Fount with Id "+id) );
		stdRep.delete(existingStudent);
		
	}
	
}
