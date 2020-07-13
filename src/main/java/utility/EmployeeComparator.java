package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator {
	public void compareEmployee(List<Employee> emp) {
		Collections.sort(emp, new EmpCompare());
		emp.forEach(System.out::println);
	}
}
