package business.abstracts;

public interface CheckService {
	
	boolean checkMail(String mail);
	boolean checkPassword(String password);
	boolean checkName(String name);
	boolean checkSurname(String surname);

}
