//This Program returns the String convert String to character array and using two pointer array
package basicDSA;
/*
 * Approach-->
 1)get a String from user as an input and pass to method reverseString and store it in String and print it.
 2)create a method reverseString which accepts STring from main method and return String to the main method.
 3)convert the String into the character array.
 4) Take one for loop and iterate until i crosses j.
 5)here we used Two Pointer Approach.
 6)we Swap the Character from i to j until i crosses j.
 7)and then we convert character array to the String and return String.
 convert char Array to String String ans=new String(arr);
 */
import java.util.Scanner;
public class ReverseWord 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String ans=reverseString(s);
		System.out.println(ans);
		sc.close();
	}
	public static String reverseString(String s)
	{
		char[]arr=s.toCharArray();
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			char ch=arr[i];
			arr[i]=arr[j];
			arr[j]=ch;
		}
		String ans=new String(arr);
		return ans;
	}
}
