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
		ThreadUsingLambda example = new ThreadUsingLambda();
		emp.add(new Employee("Akshaya", 21));
		emp.add(new Employee("Atharva", 3));
		comp.compareEmployee(emp);
		iterateCollection(emp);
		example.lambdaExp();
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