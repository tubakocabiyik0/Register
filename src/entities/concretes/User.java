package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

	
	 private String usurName;
	 private String usurSurname;
	 private String usurMail;
	 private String usurPassword;
	 
	public User() {}
	public User(String usurName, String usurSurname, String usurMail, String usurPassword) {
		super();
		this.usurName = usurName;
		this.usurSurname = usurSurname;
		this.usurMail = usurMail;
		this.usurPassword = usurPassword;
	}
	public String getUsurName() {
		return usurName;
	}
	public void setUsurName(String usurName) {
		this.usurName = usurName;
	}
	public String getUsurSurname() {
		return usurSurname;
	}
	public void setUsurSurname(String usurSurname) {
		this.usurSurname = usurSurname;
	}
	public String getUsurMail() {
		return usurMail;
	}
	public void setUsurMail(String usurMail) {
		this.usurMail = usurMail;
	}
	public String getUsurPassword() {
		return usurPassword;
	}
	public void setUsurPassword(String usurPassword) {
		this.usurPassword = usurPassword;
	}
	
	 
	
	
	
}
