package robber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Persons {
	@Test
	void test() {
		Company company = new Company();
		company.persons = new ArrayList<>();
		
		HashMap<String, String> reports = new HashMap<>();
		reports.put("Title", "The content of the report");
		reports.put("Title2", "The content of the report2");
		reports.put("Title3", "The content of the report3");
		reports.put("Title4", "The content of the report4");
	
		Boss boss = new Boss(1,"John", 36, "Pocztowa 12", null);
		company.addEmployee(2,"Mary", 24, "Parkowa 22", reports, boss);

		assertEquals("Mary", company.findEmployee("Mary").getName());
	}
	
	@Test
	void test2() {
		Company company = new Company();
		company.persons = new ArrayList<>();
		
		HashMap<String, String> reports = new HashMap<>();
		reports.put("Title", "The content of the report");
		reports.put("Title2", "The content of the report2");
		reports.put("Title3", "The content of the report3");
		reports.put("Title4", "The content of the report4");
	
		Boss boss = new Boss(1,"John", 36, "Pocztowa 12", null);
		company.addEmployee(2,"Eric", 24, "Parkowa 22", reports, boss);

		assertEquals("Mary", company.findEmployee("Mary").getName());
	}
}
