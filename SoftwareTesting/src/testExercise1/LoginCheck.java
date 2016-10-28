package testExercise1;

public class LoginCheck 
{
	boolean validateUserName(String userName)
	{
		// validateUserName returns true if the userName is between 
		// 6 and 15 characters. Otherwise it returns false.
		if((userName.length() > 6) && (userName.length() < 15))
			return true;
		else
			return false;
	}
	
	boolean validatePassword(String password) 
	{
		// validatePassword returns true if the password is between 
		// 4 and 9 characters. Otherwise it returns false.
		if((password.length() > 4) && (password.length() < 9))
			return true;
		else
			return false;
	}

}