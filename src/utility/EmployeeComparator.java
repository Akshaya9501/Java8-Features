package utility;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparator {
	public void compareEmployee(ArrayList<Employee> emp) {
		emp.add(new Employee("Akshaya", 21));
		emp.add(new Employee("Atharva", 2));
		Collections.sort(emp, new EmpCompare());
		for (Employee employee : emp) {
			System.out.println(employee.name + "" + employee.id);

		}
	}
}
