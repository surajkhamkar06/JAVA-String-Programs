import java.util.*;

class StringCount
{
	public static void main(String[] args) 
	{
		// String str = "Suraj Khamkar";

		// int count =0;
		// for(int i=0; i<str.length(); i++)
		// {
		// 	count++;	
		// }
		// System.out.println(count);

		// Integer num1 = 100;
		// Integer num2 = 100;
		// Integer num3 = 500;
		// Integer num4 = 500;

		// if(num1==num2)
		// {
		// 	System.out.println("num1==num2");
		// }
		// else
		// {
        //   System.out.println("num1!==num2");
		// }
		// if(num3==num4)
		// {
		// 	System.out.println("num3==num4");
		// }
		// else
		// {
        //   System.out.println("num3!=num4");
		// }


		// String str = "Hello";
	    // String reverse="";
		
		// for(int i=0; i<str.length(); i++)
		// {
		// 	reverse = str.charAt(i)+reverse;
		// }
		// System.out.println(reverse);


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if(num%2==1)
		{
			System.out.println( num + " : " + "It is Odd Number");
		}
		else
		{
			System.out.println(num + " : " + "It is Even Number");
		}	
	}
}

