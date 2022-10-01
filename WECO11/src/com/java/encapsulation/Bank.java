package com.java.encapsulation;

class Balance 
{
	private String name;
	private long accountNo;
	private int balance;
	public Balance(String name,long accountNo,int balance)
	{
		this.name=name;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public String getname()
	{
		System.out.println("Enter Pin");
		return name;
	}
	public long getaccountNo()
	{
		System.out.println("Enter Pin");
		return accountNo;
	}
	public int getbalance()
	{
		System.out.println("Enter Pin");
		return balance;
	}
	public void setbalance(int updatebalance)
	{
		System.out.println("Enter Pin");
		balance=updatebalance;
	}
}

public class Bank 
{
	public static void main(String[] args) 
	{
		Balance b1=new Balance("Niharika",67895432167L,55600);
		System.out.println("Name="+b1.getname());
		System.out.println("AccountNo="+b1.getaccountNo());
		System.out.println("Balance="+b1.getbalance());
		b1.setbalance(66600);
		System.out.println("Updated Balance="+b1.getbalance());
	}
}
