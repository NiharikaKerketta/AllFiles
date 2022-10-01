package com.practice.inheritance;

class Demo1
{
	int a=12;
}
class Demo2 extends Demo1
{
	int a=100;
	void disp()
	{
		System.out.println("a="+a);
		System.out.println("super.a="+super.a);
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		Demo2 ref= new Demo2();
		ref.disp();
	}

}
