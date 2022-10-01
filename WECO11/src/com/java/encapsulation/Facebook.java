package com.java.encapsulation;

class Profile
{
	private String profileName;
	private String profilePic;
	private long contactNo;
	
	public String getProfileName()
	{
		System.out.println("Login to Facebook");
		System.out.println("Enter Password");
		return profileName;
	}
	public void setProfileName(String updateProfileName)
	{
		System.out.println("Update profile name");
		profileName=updateProfileName;
	}
	public String getProfilePic()
	{
		System.out.println("Login to Facebook");
		System.out.println("Enter Password");
		return profilePic;
	}
	public void setProfilePic(String uploadProfilePic)
	{
		System.out.println("Upload profile pic");
		profilePic=uploadProfilePic;
	}
	public long getContactNo()
	{
		System.out.println("Login to Facebook");
		System.out.println("Enter Password");
		return contactNo;
	}
	public void setContactNo(long updateContactNo)
	{
		System.out.println("Update contact number");
		contactNo=updateContactNo;
	}
	
}

public class Facebook
{
	public static void main(String[] args)
	{
		Profile p1=new Profile();
		p1.setProfileName("Niharika");
		System.out.println("Profile Name="+p1.getProfileName());
		p1.setProfilePic("jpeg");
		System.out.println("Profile Pic="+p1.getProfilePic());
		p1.setContactNo(879654123L);
		System.out.println("Contact Number="+p1.getContactNo());
	}

}
