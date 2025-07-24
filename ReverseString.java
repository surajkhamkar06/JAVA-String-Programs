package package1;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str = "hello";
		
		
		String str1 = "";
		
		for(int i=str.length()-1; i>=0 ; i--)
		{
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		System.out.println(str1);
		
		
	}

}
