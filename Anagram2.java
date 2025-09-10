//This Program also Shows given String is Anagram or Not but Reduced the Time Complexity
package strings;



public class Anagram2
{
	public static void main (String[]args)
	{
		String s1="Silent";
		String s2="Listen";
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
		if(s1.length()!=s2.length())
		{
			return false;
		}
		int i=0;int j=s1.length()-1;
		while(i<j)
		{
			arr1[s1.charAt(i)-97]++;
			arr1[s2.charAt(i)-97]--;
			
			arr1[s1.charAt(j)-97]++;
			arr1[s2.charAt(j)-97]--;
			i++;j--;
		}
		if(i == j)
        {
			arr1[s1.charAt(i)-97]++;
			arr1[s2.charAt(i)-97]--;
        }

		int k=0;int l=arr1.length-1;
		while(k<l)
		{
			if(arr1[k]!=0 && arr1[l]!=0)
			{
				return false;
			}
			k++;l--;
		}
		return true;
	}
}

