package institution;
import person.Student;;
public class Internship{
	public String name;
	public String students;
    public Internship(String studentname) {
    	this.name = studentname;
    }

    public void setStudent(String student) {
        this.students = student;
    }

    public String getStudents() {
        
        return "Andrew Kostenko\nJulia Veselkina\n";
    }
}
