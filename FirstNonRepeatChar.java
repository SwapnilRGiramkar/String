//Print the First Non-Repeated Character From the String 
package strings;

public class FirstNonRepeatChar 
{
	public static void main(String[] args)
	{
		String s="SSswwaapnnil";
		char ch=firstNonRepeat(s);
		System.out.println(ch);
	}
	public static char firstNonRepeat(String s)
	{
		s=s.toLowerCase();
		boolean []visited=new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(visited[i]) continue;
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2)
				{
					visited[j]=true;
					count++;
				}
			}
			if(count==1)
				return ch1;
		}
		return ' ';
	}
}

