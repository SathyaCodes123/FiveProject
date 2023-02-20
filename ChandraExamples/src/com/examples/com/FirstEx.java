package com.examples.com;

public class FirstEx 
{
	// variables
	//int, float, double, char, String, boolean   primitive Datatypes
	
	/*
	 * int a= 3;
	 * float b=3.1f;
	 * double c=3.22;
	 * char d= 'v';
	 * String e="ram";
	 * boolean f=true or false;
	 * 
	 */
	
	int a=50;   // Global Variable or instance variable
	
	int b=60;   // Any variable declared inside class is called global variable or instance variable
	
	
	public void add()
	{
		int c=a+b;      // 'c' is declared inside method thats y we call local variable
		
		System.out.println(c);
		
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		// classname objname= new classname();
		
		FirstEx ex=new FirstEx();     // FirstEx() is called constructor, ex is abjectname, new is the keyword
		
		ex.add();
		
		System.out.println(ex.a);

	}

}
