package robber;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {
	static ArrayList<Person> persons;

	public static void main(String[] args) {
		Company company = new Company();
		
		HashMap<String, String> reports = new HashMap<>();
		reports.put("Title", "The content of the report");
		reports.put("Title2", "The content of the report2");
		reports.put("Title3", "The content of the report3");
		reports.put("Title4", "The content of the report4");
		
		persons = new ArrayList<>();
		
		Boss boss = new Boss(1,"John", 36, "Pocztowa 12", null);
		
		company.addEmployee(2,"Mary", 24, "Parkowa 22", reports, boss);
		company.addEmployee(3, "Peter", 33, "Pocztowa 16", reports, boss);
		company.addEmployee(4, "Michael", 29, "Dworcowa 18", reports, boss);
		
		Employee emp = company.findEmployee("Peter");
		System.out.print("Found employee id is: " + emp.getEmployeeId());
		
	}
	
	void addEmployee(int id, String name, int age, String address, HashMap<String, String> reports, Boss boss) {
		persons.add(new Employee(id, name, age, address, reports, boss));
	}
	
	Employee findEmployee(String name) {
		for(Person e : persons) {
			if(((Employee)e).getName().equals(name)) {
				return (Employee) e;
			}
		}
		return null;
	}
}
