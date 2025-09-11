//This program returns the count of vowel and consonents
package strings;

public class CountVowelsAndConsonents 
{
		public static void main(String[] args) 
	    {
	        String s = "ae,ioue,  ";
	        countVowelsConsonants(s);
	    }
		public static void countVowelsConsonants(String s)
		{
			int vowelCount=0;
			int consonentCount=0;
			s=s.toLowerCase();
			char []arr=s.toCharArray();
			for(int i=0;i<s.length();i++)
			{
				if(arr[i]>='a' && arr[i]<='z')
				{
					if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u' )
					{
						vowelCount++;
					}
					else
					{
						consonentCount++;
					}
				}
				
			}
			System.out.println("Vowels Count "+vowelCount);
			System.out.println("Consonent Count "+consonentCount);
		}
}

