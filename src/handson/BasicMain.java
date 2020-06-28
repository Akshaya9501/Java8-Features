package handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import utility.Employee;
import utility.EmployeeComparator;
import utility.RunnableThread;
import utility.ThreadUsingLambda;

public class BasicMain {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		EmployeeComparator comp = new EmployeeComparator();
		ThreadUsingLambda example = new ThreadUsingLambda();
		emp.add(new Employee("Akshaya", 21));
		emp.add(new Employee("Atharva", 2));
		compareEmp(emp);
		comp.compareEmployee(emp);
		iterateCollection(emp);
		example.lambdaExp();
		RunnableThread rt = new RunnableThread();
		rt.callThread();

	}

	public static void iterateCollection(ArrayList<Employee> count) {
		Iterator<Employee> i = count.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			System.out.println();
		}

	}

	public static void compareEmp(ArrayList<Employee> emp) {
		Collections.sort(emp);
		for (Employee em : emp) {
			System.out.println(em);
		}
	}

}