import java.util.*;

class BubbleSortAssending
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int num = sc.nextInt();
	int [] a = new int[num];

	for(int i=0; i<a.length-1; i++)
	{
		for(int j=0; j<a.length-i-1; j++)
		{
			int temp = a[j];
			a[j] = a[j+1];
			a[j+1] = temp;
		}
	}
	System.out.println(a);
}
}