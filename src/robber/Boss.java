package robber;

import java.util.HashMap;

public class Boss extends Person{
	private int bossId;

	public Boss( int bossId, String name, int age, String address, HashMap<String, String> reports) {
		super(name, age, address, reports);
		this.bossId = bossId;
	}

	public int getBossId() {
		return bossId;
	}

	public void setBossId(int bossId) {
		this.bossId = bossId;
	}
}
