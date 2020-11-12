package robber;

import java.util.HashMap;

public class Person{
	private String name;
	private int age;
	private String address;
	private HashMap<String, String> reports;
	
	public Person(String name, int age, String address, HashMap<String, String> reports) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.reports = reports;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public HashMap<String, String> getReports() {
		return reports;
	}

	public void setReports(HashMap<String, String> reports) {
		this.reports = reports;
	}
}
