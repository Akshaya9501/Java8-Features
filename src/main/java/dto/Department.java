package dto;

import lombok.Data;

@Data
public final class Department {
	private final String name;
	private final String specialization;

	public Department(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}

	public Department clone() {
		Department deptC = new Department(this.name, this.specialization);
		return deptC;
	}

}
