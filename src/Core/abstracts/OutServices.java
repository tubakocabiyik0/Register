package Core.abstracts;

import entities.concretes.User;

public interface OutServices {
	
	void register(User user);
    void signIn(String mail,String password);
    
}
