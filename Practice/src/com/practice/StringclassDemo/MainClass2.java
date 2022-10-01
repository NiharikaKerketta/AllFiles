package com.practice.StringclassDemo;

class Demo5
{
	
}
class Demo6
{
	public String toString()
	{
		return "this is demo6";
		
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		Demo5 d1=new Demo5();
		System.out.println(d1.toString());
		
		Demo6 d2= new Demo6();
		System.out.println(d2.toString());
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);

	}

}
