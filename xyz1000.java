// File Name : Sample.java
class A
{
	A()
	{
		System.out.println("This is constructor of class A");
	}
} // End of class A
class B extends A
{
	B()
	{
		System.out.println("This is constructor of class B");
	}
} // End of class B
class Test
{
	public static void main(String[] args)
	{
		B	b1	=	new	B();
	}// End of Method
}// End of Class Test
