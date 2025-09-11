//This program remove duplicate but uses predefined method i.e. contains
package strings;
/*
 Approach-->
 1)Create a main method which has contains duplicate characaters.
 2)we gave the String to remove Duplicate method and create empty String.
 3)we iterate the for loop at the length of the String .
 4)we extract character from the String concat with empty String and store in the String.
 5)then use predefined contains method which shows thw occurance of String or char.
 6)if char already present its skip the it if its not contain add to the ans .
 7)and in last return the ans .
 */
public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		String s="hjgjhagfa";
		String ans =removeDuplicate(s);
		System.out.println(ans);
	}
	public static String removeDuplicate(String s)
	{
		String ans ="";
		
		for(int i=0;i<s.length();i++)
		{
			String ch=""+s.charAt(i);
			if(ans.contains(ch))
			{
				continue;
			}
			ans+=ch;
		}
		return ans;
	}
}

