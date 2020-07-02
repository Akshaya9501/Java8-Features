package handson;

import java.util.ArrayList;
import java.util.Iterator;

import multithreading.RunnableThread;
import multithreading.ThreadUsingLambda;
import utility.Employee;
import utility.EmployeeComparator;

public class BasicMain {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		EmployeeComparator comp = new EmployeeComparator();
		ThreadUsingLambda thread = new ThreadUsingLambda();
		emp.add(new Employee("Akshaya", 1191899));
		emp.add(new Employee("Atharva", 201512));
		// Implementation of ForEach method
		emp.forEach(i -> System.out.println(i));
		// Implementation of Comparator
		comp.compareEmployee(emp);
		// Iterator implementation
		iterateCollection(emp);
		// Thread using Lambda exp
		thread.lambdaExp();
		// Using runnable interface
		RunnableThread rt = new RunnableThread();
		rt.callThread();
	}

	public static void iterateCollection(ArrayList<Employee> empList) {
		Iterator<Employee> i = empList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}