package Core.concretes;

import Core.abstracts.OutServices;
import entities.concretes.User;

public class GoogleServiceAdapter implements OutServices {

	OutServices outservice;

	public GoogleServiceAdapter(OutServices outservice) {
		super();
		this.outservice = outservice;
	}

	@Override
	public void register(User user) {
		outservice.register(user);

	}

	@Override
	public void signIn(String mail, String password) {
		outservice.signIn(mail, password);

	}

}
