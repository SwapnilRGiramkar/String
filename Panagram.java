//This Program Shows a Given String is Panagram or Not 
package strings;

public class Panagram 
{
	public static void main(String[]args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		if(isPanagram(s))
		{
			System.out.println("Its Panagram");
		}
		else
		{
			System.out.println("Its not Panagram");
		}
	}
	public static boolean isPanagram(String s)
	{
		s=s.toLowerCase();
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue;
			}
			arr[s.charAt(i)-97]++;
		}
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]==0)
			{
				return false;
			}
		}
		return true;
	}
}

