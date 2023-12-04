package StudentMain.Project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentMain.Project1.entity.Student;
import StudentMain.Project1.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	public StudentService stdSer;

	@GetMapping("/students")
	List<Student> getAllStudent() {
		return stdSer.getAllStudent();
	}

	@GetMapping("/students/{id}")
	public Student getById(@PathVariable long id) {
		return stdSer.getById(id);
	}

	
	@PostMapping("/students")
	public Student addNewStudent(@RequestBody Student std ) {
		return stdSer.addNewStudent(std);
		
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Object> modifyById(@PathVariable (value = "id") long id, @RequestBody Student std){
		return ResponseEntity.ok(stdSer.modifyById(id , std));
		
	}
	
	@DeleteMapping("/students/{id}")
	public String DeleteByID(@PathVariable (value = "id") long id) {
		stdSer.DeleteById(id);
		return "Deleted Succsessfully";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
