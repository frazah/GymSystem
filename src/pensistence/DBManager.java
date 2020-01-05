package pensistence;

import java.util.ArrayList;
import java.util.List;


public class DBManager {
	private static DBManager instance = null;
	
	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	
	private DBManager() {
		
	}

	/*public Utente login(String username, String password) {
		if (username.equals("kristian") && password.equals("kristian")) {
			Utente u = new Utente();
			u.setUsername("kristian");
			u.setPassword("kristian");
			return u;
		}
		return null;
	}*/

}
