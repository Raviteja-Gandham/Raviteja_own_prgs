//Hierarchical : one base class and Multiple child classes
class P
{
	P(int x)
	{
		System.out.println(x);
	}
}
class C extends P
{
	C(int a)
	{
		super(a);
		System.out.println(a);
	}
}
class D extends P
{
	D(int x)
	{
		super(x);
		System.out.println("D class constructor");
	}
	void m()
	{
		System.out.println("D class method M");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		C c=new C(10);
		
		D d=new D(20);
		d.m();

	}

}
