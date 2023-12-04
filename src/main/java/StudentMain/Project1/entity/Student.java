package StudentMain.Project1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private long mobileno;
	
	
	public Student() {
	
	}

	public Student(long id, String name, long mobileno) {
		
		this.id = id;
		this.name = name;
		
		this.mobileno = mobileno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	
	
	
}
