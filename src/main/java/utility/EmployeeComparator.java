package utility;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparator {
	public void compareEmployee(ArrayList<Employee> emp) {
		Collections.sort(emp, new EmpCompare());
		emp.forEach(System.out::println);
	}
}
