package databaseAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	public void save(User user);
	public List<User> get();
  
}
