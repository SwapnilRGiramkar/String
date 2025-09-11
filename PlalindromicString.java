//This Program Shows a Given String is Palindromic or Not 
package basicDSA;

public class PalindromeCheck 
{
	  public static void main(String[] args) 
	  {
		  String a="abba";
		  if (isPalindrome(a)) {
			System.out.println("Its Palindrome ");
		}
		  else
		  {
			  System.out.println("Its not palindrome");
		  }
	  }
	  public static boolean isPalindrome(String s)
	  {
		 for(int i=0,j=s.length()-1;i<j;i++,j--)
		 {
			while(s.charAt(i)!=s.charAt(j)) 
			{
				return false;
			}
		 }
		 return true;
	  }
}

