import java.util.Scanner;
class ReverseNumber
{
	public static void main(String ar[])
	{
		int num,rev=0,remainder;
		Scanner sr=new Scanner(System.in);
		num=sr.nextInt();
		while(num!=0)
		{
			remainder =num%10;
			rev = rev*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse: "+rev);
		//System.out.println("Remainder: "+remainder);
		//System.out.println("Number: "+num);
	}
}