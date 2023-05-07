package ATM;

import java.util.HashMap;
import java.util.Objects;

public class Datasource {

	HashMap<String, String> data = new HashMap<>();
	
	public Datasource() {
		data.put("1", "1");
		data.put("Jainam", "Ja2214");
		data.put("kala", "kala123");
		data.put("lala", "lala987");
	}
	
	public boolean query(String user) {
		return data.containsKey(user);
	}
	
	public boolean db(String name,String passcode) {
        return Objects.equals(data.get(name),passcode);
    }
}
