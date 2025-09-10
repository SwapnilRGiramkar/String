//This Program gives a given String is Anagram or not
package strings;

import java.util.Arrays;

public class Anagram 
{
	public static void main (String[]args)
	{
		String s1="abc";
		String s2="acb";
		if(isAnagram(s1, s2))
		{
			System.out.println("Anagram ");
		}
		else
		{
			System.out.println("its Not Anagram");
		}
	}
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int []arr1=new int[26];
		int []arr2=new int[26];
		if(s1.length()!=s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			arr1[s1.charAt(i)-97]++;
			arr2[s2.charAt(i)-97]++;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		return true;
	}
}

