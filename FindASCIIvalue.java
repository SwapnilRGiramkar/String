//This Shows all the Ascii value array of given String
package strings;

import java.util.Arrays;

public class FindASCIIvalue
{
	public static void main(String[] args) 
	{
		String s="HelloWorld";
		int []ans=findASCII(s);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] findASCII(String s)
	{
		int[]ans=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
			if(ch>='A' && ch<='Z' )
			{
				ans[i]=ch;
			}
			else if(ch>='a'&& ch<='z')
			{
				ans[i]=ch;
			}
		}
		return ans;
	}
	
}

