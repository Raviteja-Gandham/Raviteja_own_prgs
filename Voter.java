/*
import java.util.Scanner;
class SingleDigit
{
public static void main(String args[])
{
int rem,s=0,sum=0,rev=0,r=0;
Scanner sr=new Scanner(System.in);
int num=sr.nextInt();
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
sum=sum+rem;
}
if(sum>9)
{
r=sum%10;
s=s*10+r;
sum=sum/10;
}
      System.out.println(s+sum);

    }
}*/
/*
public class SingleDigit
{
public static void main(String args[])
{
	for(int i=1;i<=50;i++)
	{
	if(i%4==0)
	{
	if(i%5==0)
	      System.out.println("FizzBuzz");
	else
	      System.out.println("Fizz");
	}
	else if(i%5==0)
	{
	System.out.println("Buzz");
	}
	else
	{
	System.out.println(i);
	}
	}
	}
	}*/
/*
public class SingleDigit
{
public static void main(String args[])
{
	System.out.println((int)(Math.pow(2,2)));
	System.out.println(Math.pow(2,3));
	System.out.println(Math.pow(3,2));
	System.out.println(Math.pow(3,3));
	System.out.println(Math.pow(4,2));
	System.out.println(Math.pow(4,3));
	System.out.println((int)(Math.pow(2,2)));
	System.out.println((int)(Math.pow(2,3)));
	System.out.println((int)(Math.pow(3,2)));
	System.out.println((int)(Math.pow(3,3)));
	System.out.println((int)(Math.pow(4,2)));
	System.out.println((int)(Math.pow(4,3)));
}
}i wrote correct code as well as class name as Powers but here it is showing "
*/
class Voter
{
public static void main(String args[])
{
int age=25,vage=18;
if(age>=vage)  //age is greater than the vage execute if block
{
System.out.println("Old enough to vote!");
}
else  // if age is less than the vage then execute else statement
{
System.out.println("Not old enough to vote");
}
}
}
