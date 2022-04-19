package model;

public class Program
{

	String name;
	
	public Program(String name)
	{
		this.name = name;
	}
	
	public Program()
	{
		this.name = "PLz change me";
	}

	@Override
	public String toString()
	{
		return name;
	}

}
