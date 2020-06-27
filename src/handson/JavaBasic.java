package handson;

import java.util.ArrayList;

import utility.Employee;
import utility.EmployeeComparator;

public class JavaBasic {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		EmployeeComparator comp = new EmployeeComparator();
		comp.compareEmployee(emp);

	}

	/*
	 * int s = 1 / 0; // throw new MeException("eee"); File f = new
	 * File("c:/java/");
	 * 
	 * try { Scanner sc = new Scanner(f); } catch (FileNotFoundException e) { //
	 * TODO Auto-generated catch block // throw new
	 * MeException("Excpetion in file"); }
	 */

	/*
	 * DemoClass t = new DemoClass(); t.start();
	 */

	/*
	 * String s="bye"; s.concat("t"); System.out.println(s);
	 */
	/*
	 * Employee e = new Employee(); e.setName("Akshaya"); e.setId(2); Employee
	 * e2 = new Employee(); e2.setName("Pappa"); e2.setId(3); Employee e3 = new
	 * Employee(); e3.setName("Athu"); e3.setId(4); List<Employee> l=new
	 * ArrayList<>(); l.add(e); l.add(e2); l.add(e3); Collections.sort(l, new
	 * CompareEle()); System.out.println(l); for(Employee li:l) {
	 * System.out.println(li.getName()); }
	 */

	/*
	 * class CompareEle implements Comparator<Employee> {
	 * 
	 * public int compare(Employee e, Employee e2) { return
	 * (e.getName().length() - e2.getName().length()); } }
	 */

}
