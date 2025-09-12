//Check if given String is Rotating Palindrome or Not
package strings;

public class RotatingPal 
{
	public static void main(String[] args) 
	{
		String s="saa";
		System.out.println(checkPalPos(s));
	}
	public static boolean checkPalPos(String s)
	{
		if(isPalindrome(s))
		{
			return true;
		}
		else
		{
			String rot=rotate(s);
			while(!s.equals(rot))
			{
				if(isPalindrome(rot))
				{
					return true;
				}
				rot=rotate(rot);
			}
		}
		return false;
	}
	public static boolean isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static String rotate(String s)
	{
		String ans=""+s.charAt(s.length()-1);
		for(int i=0;i<s.length()-1;i++)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}
}

