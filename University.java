package institution;

import java.util.logging.Level;

import person.Student;


public class University {
	private String name;
	
    public University(String name) {
    	this.name = name;
    }
    public void setStudent(Student student) {
        student.setX(null);
    }

    public void addStudent(Student student) {
    	student.getX();
    }
}
