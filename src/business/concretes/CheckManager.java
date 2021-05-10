package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.CheckService;

public class CheckManager implements CheckService {

	String regex = "^(.+)@(.+)$";

	Pattern pattern = Pattern.compile(regex);

	@Override
	public boolean checkMail(String mail) {

		Matcher matcher = pattern.matcher(mail);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Girdiðiniz mail geçersizdir lütfen yeni mail giriniz");
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("þifreniz 6 karakterden fazla olmalý");
			return false;
		} else
			return true;
	}

	@Override
	public boolean checkName(String name) {
		if (name.length() < 4) {
			System.out.println("isminiz 3 karakterden az olmalý");
			return false;
		} else
			return true;
	}

	@Override
	public boolean checkSurname(String surname) {
		if (surname.length() < 4) {
			System.out.println(" soyisminiz 3 karakterden az olmalý");
			return false;
		} else
			return true;
	}

}
