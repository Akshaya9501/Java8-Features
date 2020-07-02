package dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Immutable custom class 
public final class Employee {

	private final int id;
	private final String name;
	private final String[] phones;
	private final String[] address;
	private final List<Department> deptList;

	public Employee(int id, String name, String[] phones, String[] address, List<Department> dept) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones.clone();
		this.address = address.clone();

		List<Department> deptList = new ArrayList<Department>();
		try {
			for (Department deptObj : dept) {
				deptList.add(deptObj.clone());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		this.deptList = deptList;
	}

	public List<Department> getDept() {
		List<Department> dept = new ArrayList<Department>();
		for (Department deptObj : this.deptList) {
			dept.add((Department) deptObj.clone());
		}
		return dept;
	}

	public int getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String[] getPhones() {
		String[] copyPhone = new String[this.phones.length];
		System.arraycopy(this.phones, 0, copyPhone, 0, copyPhone.length);
		return copyPhone;
	}

	public String[] getAddress() {
		String[] copyAdd = new String[this.address.length];
		System.arraycopy(this.address, 0, copyAdd, 0, copyAdd.length);
		return copyAdd;
	}

	public static void main(String args[]) {
		String[] address = { "Mumbai", "Thane", "Pune" };
		String[] phones = { "+918975942656", "+918344795641" };
		List<Department> deptList = new ArrayList<Department>();
		deptList.add(new Department("Comps", "Maths"));

		Employee emp = new Employee(1, "akshaya", phones, address, deptList);
		System.out.println("Before adding department object:" + emp);
		deptList.add(new Department("oopm", "senior"));
		System.out.println("After adding department object:" + emp);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phones=" + Arrays.toString(phones) + ", address="
				+ Arrays.toString(address) + ", dept=" + deptList + "]";
	}

}
