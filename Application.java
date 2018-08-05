package test;
import java.util.ArrayList;
import java.util.Scanner;

import institution.Internship;
import institution.University;
import person.Student;
public class Application {

	public static void main(String[] args){
		University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));
        

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        
	}

}
