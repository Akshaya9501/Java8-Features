package utility;

import java.util.Comparator;

public class EmpCompare implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id;
	}
	// Functional interfcae implementation of Comparator
	// Comparator<Employee> comp = (e1, e2) -> e1.id - e2.id;
}
