package Practice_Java;

public class Program2 {

	public static void main(String[] args) {
		int n=16;
		if(n%5==0 && n%3==0) {
			System.out.println("hi bye");
		}

		else if(n%5==0)
		{
			System.out.println("bye");
		}
		else if(n%3==0)
		{
			System.out.println("hi");
		}
		
		else
			System.out.println("GoodBye");
	}

}
