import java.util.Scanner;
class Scanner
 	{
	 public static void main(String s[])
	{
		int i=1,n;
		System.out.println("enter the limit n:");
		Scanner input=new scanner(System.in);
		n=input.nextInt();
		System.out.println("0dd number");
		do
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
	i++;
	}while(i<=n);
	}
}