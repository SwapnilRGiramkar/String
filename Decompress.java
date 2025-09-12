//This Program gives the input of Compress String (Encrypted String) and gives output of Decompress String (Decrypted String)
package strings;

public class Decompress 
{
	public static void main(String[] args) 
	{
		String s="a4b4c4d9";
		System.out.println(decompress(s));
	}
	public static String decompress(String s)
	{
		String ans="";
		char temp='\u0000';
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') 
			{
				temp=ch;
			}
			else 
			{
				num=num*10+(ch-48);
			}
			if((i+1<s.length()) && (s.charAt(i+1)>='a' && s.charAt(i+1)<='z' || s.charAt(i+1)>='a' && s.charAt(i+1)<='z'))
			{
				ans=ans+repeat(num,temp);
				num=0;
			}
		}
		ans=ans+repeat(num,temp);
		return ans;
	}
	public static String repeat(int num,char ch)
	{
		String ans="";
		for(int i=0;i<num;i++)
		{
			ans=ans+ch;
		}
		return ans;
	}
}

