import business.abstracts.UserService;
import business.concretes.CheckManager;
import business.concretes.UserManager;
import databaseAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Tuba","Kocabýyýk","tuba@gmail.com","12121212");
		User user2 = new User("bfbfbf","sbffbsfby","dvdvdv@gmail.com","dvdvdvdvdvdv");

		
		UserService userService = new UserManager(new HibernateUserDao(),new CheckManager()); 
		userService.register(user1);
        userService.Login("tuba@gmail.com", "12121212");
	}

}
