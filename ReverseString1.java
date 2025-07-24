package package1;

public class ReverseString1 
{
	public static void main(String[] args) 
	{
		String str = "hello";

		StringBuffer bf = new StringBuffer(str);
		bf.reverse();
		System.out.println(bf);

	}

}
