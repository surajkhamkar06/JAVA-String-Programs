import java.util.*;

class Trim
{
	static String str;
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String : ");
			str = sc.nextLine();

			String str1 = userTrim();

			System.out.println(str + " : " + str.length());
			System.out.println(str1 + " : " + str1.length());
		}
		public static String userTrim()
		{
			return str.trim();
		}
		
	}
