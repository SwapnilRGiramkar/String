//Maximum Occuring Character in String 
package strings;

public class FindMaximumOccuringChar 
{
	public static void main(String[] args) 
	{
		String s="abbbaacccsljaasdffffffffffffffff";
		char ch=maxOccurance(s);
		System.out.println(ch);
	}
	public static char maxOccurance(String s)
	{
		s=s.toLowerCase();
		char ch=' ';
		boolean []visited=new boolean[s.length()];
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(visited[i])continue;
			
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2)
				{
					visited[j]=true;
					count++;
				}
				if(max<count)
				{
					max=count;
					ch=ch1;
				}
			}
		}
		return ch;
	}
}

