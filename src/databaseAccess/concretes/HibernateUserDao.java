package databaseAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import databaseAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void save(User user) {
		System.out.println("user Saved" + user.getUsurName());
		users.add(user);
	}

	@Override
	public List<User> get() {
		return users;
	}

}
