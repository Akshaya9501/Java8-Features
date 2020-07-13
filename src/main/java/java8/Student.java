package java8;

import lombok.Data;

@Data
public class Student {

	 int id;
	 String name;
	 int grade;

	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public Student(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println(name);
	}
}
