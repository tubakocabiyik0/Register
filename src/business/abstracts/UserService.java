package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void register(User user);
	void Login(String mail,String password);
	
}
