package practice;

public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		int no=151;
		int rev=0;
		int temp=no;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;//151%10=5
			rev=rev*10+rem;//0*10+5=5
			temp=temp/10;//151/10=
			
		}
		if(no==rev)
		{
			System.out.println("This is palindrome no");
		}
		else 
		{
			System.out.println("This is no palindrome no");
			
		}

	}

}
