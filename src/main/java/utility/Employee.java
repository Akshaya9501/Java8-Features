package utility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return this.name + " " + this.id;
	}
}
