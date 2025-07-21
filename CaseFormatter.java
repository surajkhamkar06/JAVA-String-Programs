import java.util.*;

class StringDemo
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next().toLowerCase();

		String newString = "";

		for(int i=0; i<str.length(); i++)
		{
			if(i%2==0)
			{
				newString = newString + str.substring(i, i+1).toUpperCase();
			}
			else 
			{
				newString = newString + str.substring(i, i+1).toLowerCase();
			}
		}
        System.out.println("Before : " + str);
		System.out.println("Resultant:" + newString);
	 }
}