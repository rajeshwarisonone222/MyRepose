package practice;

public class PlindromeNO 
{

	public static void main(String[] args) 
	{
		int no=151;
		int temp=no;
		int rev=0;int rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("No Is Palindrome");
		}
		else
		{
			System.out.println("No is not palindrome");
		}

	}

}
