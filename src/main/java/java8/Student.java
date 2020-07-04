package java8;

import lombok.Data;

@Data
public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
