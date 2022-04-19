package model;

public class user
{

	String username;
	
	public user()
	{
		this.username = "default";
	}
	
	public user(String username)
	{
		this.username = username;
	}

	@Override
	public String toString()
	{
		return username;
	}
	
}
