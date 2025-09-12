//This Program count the FRequncy of an Given String 
package strings;
/*
 * Approch--->
 1)Given String pass to method frequency(String s) method doesnt return anything.
 2)then convert STring to character Array and create one boolean array.
 3)iterate loop till array.length
 4)if visited[i] is false then continue oherwise go to next.
 5)create one count variable with value 0.
 6)then iterate another loop who checks both value are same or not if its same count increases.
 7)at the last print 
 */
public class FrequencyOfCharInString 
{
	public static void main(String[] args) 
	{
		String s="Hello World";
		frequency(s);
	}
	public static void frequency(String s)
	{
		char []arr=s.toCharArray();
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]) continue;
			int count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
				
			}
			System.out.println(arr[i] + " → " + count);
		}
	}
}

