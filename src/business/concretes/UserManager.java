package business.concretes;

import java.util.List;

import business.abstracts.CheckService;
import business.abstracts.UserService;
import databaseAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	UserDao userdao;
	CheckService checkService;

	public UserManager(UserDao userdao, CheckService checkService) {
		super();
		this.userdao = userdao;
		this.checkService = checkService;
	}

	@Override
	public void register(User user) {
		System.out.println("çalýsýyor");
		if (userdao.get().isEmpty()) {
			if (checkService.checkMail(user.getUsurMail()) == true
					&& checkService.checkPassword(user.getUsurPassword()) == true
					&& checkService.checkName(user.getUsurName()) == true
					&& checkService.checkSurname(user.getUsurPassword()) == true) {
				System.out.println("Kayit basarili");
				userdao.save(user);
			} else {
				for (User users : userdao.get()) {
					if (users.getUsurMail().equals(user.getUsurMail())) {
						System.out.println("Bu mail ile giriþ yapamazsýnýz ");
					} else {
						if (checkService.checkMail(user.getUsurMail()) == true
								&& checkService.checkPassword(user.getUsurPassword()) == true
								&& checkService.checkName(user.getUsurName()) == true
								&& checkService.checkSurname(user.getUsurPassword()) == true) {
							System.out.println("Kayit basarili");
							userdao.save(user);

						}
					}

				}
			}
		}
	}

	@Override
	public void Login(String mail, String password) {

		for (int i = 0; i < userdao.get().size(); i++) {
			if (userdao.get().get(i).getUsurMail().equals(mail)
					&& userdao.get().get(i).getUsurPassword().equals(password)) {
				System.out.println("Giris basarili");

				return;

			}
		}

	}

}
