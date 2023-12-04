package StudentMain.Project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentMain.Project1.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

	

}
