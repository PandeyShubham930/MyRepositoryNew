package demo;

import java.util.ResourceBundle;

public class Prog1 
{
	
	
	public int getLogin(String entering_UN, String entering_PWD)
	{
		ResourceBundle rb = ResourceBundle.getBundle("Config");
		String username =rb.getString("userName");
		String pwd =rb.getString("password");
		
		if(username.equals(entering_UN) && pwd.equals(entering_PWD))
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
	}

}
