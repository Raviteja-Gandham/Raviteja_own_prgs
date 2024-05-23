import java.util.*;
public class GeometrySwitch {

	public static void area(int l, int b)
	{
		System.out.println(l*b);
	}
	public static void area(double r)
	{
		double PI=3.14;
		System.out.println(PI*(r*r));
	}
	public static void area(double l, double b, double h)
	{
		System.out.println(l*b*h);
	}
	
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("1.Area of a Rectangle\n2.Area of a Circle");
		System.out.print("3.Volume of a Box\n4.Exit\n");
		System.out.println("Enter your choice: ");
		int  choice=sr.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Length & Breadth : ");
				area(sr.nextInt(),sr.nextInt());
				break;
			case 2:
				System.out.println("Enter Radius only : ");
				area(sr.nextDouble());
				break;
			case 3:
				System.out.println("Enter Length , Breadth & Height : ");
				area(sr.nextDouble(),sr.nextDouble(),sr.nextDouble());
			case 4:
				System.out.println("Exit Successfully.....");
				break;
			default:
				System.out.println("Enter valid input");
		}

		
	}

}
