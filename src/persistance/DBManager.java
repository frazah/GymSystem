package persistance;

import model.Utente;

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

	public Utente login(String email, String password) {
		if (email.equals("enac@gmail.com") && password.equals("oid")) {
			Utente u = new Utente();
			u.setEmail("enac@gmail.com");
			u.setPassword("oid");
			return u;
		}
		return null;
	}

}
