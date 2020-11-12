package robber;

import java.util.HashMap;

public class Employee extends Person{
	private int employeeId;
	private Boss boss;

	public Employee(int employeeId, String name, int age, String address, HashMap<String, String> reports, Boss boss) {
		super(name, age, address, reports);
		this.employeeId = employeeId;
		this.boss = boss;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}
}
