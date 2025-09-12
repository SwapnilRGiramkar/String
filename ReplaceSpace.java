//Replace all the Spaces from the string to the '-'
package strings;

public class ReplaceSpaces
{
	public static void main(String[] args) 
	{
		String s ="Hello World";
		String ans=replaceSpace(s,"");
		System.out.println(ans);
	}
	public static String replaceSpace(String s,String ans)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch==' ')
			{
				ans=ans+'-';
				
			}
			else
			{
				ans=ans+ch;
			}
		}
		return ans;
	}
}

