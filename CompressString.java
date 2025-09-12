//This Program Compress the String 
package strings;

public class Compress1
{
	public static void main(String[] args) 
	{
		String s="aaaabbbbccccddddddddd";
		System.out.println(compress(s));
	}
	public static String compress(String s)
	{
		String ans="";
		int count=1;
		for(int i=0,j=i+1;i<s.length();)
		{
			if(j<s.length() && (s.charAt(i)==s.charAt(j)))
			{
				count++;
				j++;
			}
			else
			{
				ans=ans+s.charAt(i);
				ans=ans+count;
				count=1;
				i=j;
				j=i+1;
			}
		}
		return ans;
	}
}

