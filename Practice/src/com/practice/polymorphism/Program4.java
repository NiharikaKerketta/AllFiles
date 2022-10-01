package com.practice.polymorphism;

class StudentV1
{
	void corejava()
	{
		System.out.println("core java");
	}
}
class StudentV2 extends StudentV1
{
	void selenium()
	{
		System.out.println("selenium");
	}
}
class Company
{
	void interview(StudentV1 v1)
	{
		v1.corejava();
	}
}
public class Program4
{

	public static void main(String[] args)
	{
		Company c1=new Company();
		c1.interview(new StudentV2());
	}

}
