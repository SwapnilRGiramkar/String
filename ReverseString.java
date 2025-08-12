//This is the example of Reverse the String 
//Exampe-->
public class ReverseString 
{
	public static void main(String[] args)
	{
		String input="Swapnil";
		String Output=reverseString(input);
		System.out.println(Output);
	}
	public static String reverseString(String str)
	{
		char[] arr=str.toCharArray();
		int left=0;
	        int right=arr.length-1;
		if(right<left)
		{
			return "";
		}
		while(left<right)
		{
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return String.valueOf(arr);
	}
}


