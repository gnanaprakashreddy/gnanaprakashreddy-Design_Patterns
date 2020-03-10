package com.epam.chainOfResponsibilities;

public class LoginUser {
	private String userName;
	private String userPassword;
	
	public LoginUser(String userName, String userPassword){
		this.userName = userName;
		this.userPassword = userPassword;
		LoginUser(userName,userPassword);
	}
	
	
	
	private void LoginUser(String userName2, String userPass2) {
		// TODO Auto-generated method stub
		validateCredentials(userName,userPassword);
	}



	private void validateCredentials(String userName, String userPassword) {
		
		if(userName.isEmpty())
			System.out.println("Please enter userName\n");
		
		UserDb user_db  = new UserDb();
		
		if(user_db.userExists(userName))
		{
			validatePassword(userName,userPassword);
		}
		else
			System.out.println("User ID not found!");
	}
	
	private void validatePassword(String userName, String password) {
		PasswordValidator passwordValidator  = 
				new PasswordValidator();
		if(passwordValidator.isMappedTo(userName, password))
			System.out.println("LoginUser succesfull! to "+userName);
		else
				System.out.println("Invalid password!");
	}
}
