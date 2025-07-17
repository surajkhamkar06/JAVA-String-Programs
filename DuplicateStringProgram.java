import java.util.*;

class DuplicateString
{
	public static void main(String[] args) 
	{
		// String str = "programming";

		// StringBuffer sb = new StringBuffer();

		// for(int i=0; i<str.length(); i++)
		// {
		// 	char ch = str.charAt(i);
		// 	int indx = str.indexOf(ch, i+1);

		// 	if(indx==-1)
		// 	{
		// 		sb.append(ch);
		// 	}
		// }
		// System.out.println(sb);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();

		StringBuffer sb = new StringBuffer();

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int indx = str.indexOf(ch, i+1);

			if(indx==-1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}