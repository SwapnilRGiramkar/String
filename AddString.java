//*We have given a two String as number Add A Strings and Return the sum as String 
package strings;
/*
 *We have given a two String as number Add A Strings and Return the sum as String 
 */
public class demo
{
	public static void main(String[] args) {
		String s1="1064681534";
		String s2="20";
		String ans=add(s1,s2);
		System.out.println(ans);
	}
	public static String add(String s1,String s2)
	{
		String ans="";
		long num1=Long.parseLong(s1);
		long num2=Long.parseLong(s2);
		long sum=num1+num2;
		ans=String.valueOf(sum);
		return ans;
	}
}

