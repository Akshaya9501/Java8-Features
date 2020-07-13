package handson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import multithreading.RunnableThread;
import multithreading.ThreadUsingLambda;
import utility.Employee;
import utility.EmployeeComparator;

public class BasicMain {

    public static void main(String[] args) throws InterruptedException {
        List<Employee> emp = new ArrayList<>();
        EmployeeComparator comp = new EmployeeComparator();
        ThreadUsingLambda thread = new ThreadUsingLambda();
        emp.add(new Employee("Akshaya", 1191899));
        emp.add(new Employee("Atharva", 201512));
        // Implementation of ForEach method
        emp.forEach(System.out::println);
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

    public static void iterateCollection(List<Employee> empList) {
        for (Employee employee : empList) {
            System.out.println(employee);
        }

    }

}