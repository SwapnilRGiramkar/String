//This Shows Permutations of an String 
package strings;

public class Permutations 
{
	public static void main(String[] args) 
	{
		String s="abcd";
		permutation(s.toCharArray(),0);
	}
	public static void permutation(char[] arr,int fix)
	{
		if(fix==arr.length-1)
		{
			System.out.println(new String(arr));
			return;
		}
		for(int i=fix;i<arr.length;i++)
		{
			swap(arr,fix,i);
			permutation(arr, fix+1);
			swap(arr,i,fix);
		}
	}
	public static void swap(char[]arr,int i,int j)
	{
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

