package spring;

public class RegisterRequest {

	private String email;
	private String passwod;
	private String confirmPassword;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return passwod;
	}

	public void setPassword(String passwod) {
		this.passwod = passwod;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public boolean isPasswordEqualToConfirmPassword() {
		return passwod.equals(confirmPassword);
	}

	public void getName(String name) {
		System.out.println(name);
	}
	
	
}
