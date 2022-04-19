package model;

public class Channel
{

	String c_name;
	
	public Channel(String c_name)
	{
		this.c_name = c_name;
	}
	
	
	
	public Channel()
	{
		this.c_name = "plz_change";
	}

	@Override
	public String toString()
	{
		return c_name;
	}
	
	
	
}
