package com.practice.polymorphism;

class Demo11
{
	float c=8.9f;
	void task()
	{
		System.out.println("task method");
	}
}
class Demo12 extends Demo11
{
	double b=56.89;
	void end()
	{
		System.out.println("end method");
	}
}
class Demo13 extends Demo12
{
	int d=45;
}
class Sample5
{
	void run(Demo11 ref1)
	{
		System.out.println("c="+ref1.c);
		ref1.task();
		Demo13 ref3=(Demo13)ref1;
		System.out.println("b="+ref3.b);
		ref3.end();
		System.out.println("d="+ref3.d);
	}
}
public class Program6
{
	public static void main(String[] args) {
		Sample5 s1=new Sample5();
		s1.run(new Demo13());
		
		
		//Demo11 d1=new Demo13();
		//System.out.println("c="+d1.c);
		//d1.task();
		//Demo12 d2=(Demo12)d1;
		//System.out.println("c="+d2.c);
		//d2.task();
		//System.out.println("b="+d2.b);
		//d2.end();
		//Demo13 d3=(Demo13)d2;
		//System.out.println("c="+d3.c);
		//d3.task();
		//System.out.println("b="+d3.b);
		//d3.end();
		//System.out.println("d="+d3.d);
		
	}

}
