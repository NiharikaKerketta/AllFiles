package com.practice.polymorphism;

class Demo1
{
	final int a=12;
	final void run()
	{
		System.out.println("run method");
	}
}
class Demo2 extends Demo1
{
	
}
public class Program2
{
	public static void main(String[] args)
	{
		Demo2 ref=new Demo2();
		System.out.println("a="+ref.a);
		ref.run();
	}

}
