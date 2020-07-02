package dto;

public final class Department {
	private final String name;
	private final String specialization;

	public Department(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public Department clone() {
		Department deptC = new Department(this.name,this.specialization);
		return deptC;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", specialization=" + specialization + "]";
	}

}
