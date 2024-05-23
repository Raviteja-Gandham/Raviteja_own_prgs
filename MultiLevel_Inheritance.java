class Pp
{
	void m1()
	{
		System.out.println("Pp class M1 Method");
	}
}
class C1 extends Pp	//final class C1 extends P  // By using final keyword we can stop the inheritance
{						  
	void m2()
	{
		System.out.println("C1 class M2 Method");
	}
}
class C2 extends C1 	// final class can not be Inherited.
{
	void m3()
	{
		System.out.println("C2 class M3 Method");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		
		C2 c=new C2();
		c.m1();
		c.m2();
		c.m3();

	}

}
