// File Name : Test.java
class A	
{	int a,b;
	A(int a, int b) { this.a = a; this.b = b;}
	public int hashCode()
	{
		return -1000;
	}
	public boolean equals(Object o)
	{
		return false;
	}

	public String toString()
	{
		return "a= "+a+ "b="+b;
	}
}	// End of class A
class Test1000
{
	public static void main(String args[])
	{
		A	a1	=	new	A(34,56);
		A	a2	=	new	A(21,80);
		A	a3	=	a1;

		System.out.println(a1.toString());
		System.out.println(a2.toString());

		System.out.println(a1);
		System.out.println(a2);

		
	
	}// End of Method
}// End of class Test
