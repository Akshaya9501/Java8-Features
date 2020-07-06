package java8;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
	public static Student student() {
		return new Student(1, "Rijul", 4);
	}

	public static List<Student> addStudents() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Rijul", 4));
		studentList.add(new Student(2, "Sneha", 5));
		studentList.add(new Student(3, "Farah", 4));
		studentList.add(new Student(4, "Ira", 1));
		return studentList;
	}
}
