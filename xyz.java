class A
{
	private int a;
	private int b;
	/*
	A(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	*/
	public void display()
	{
		System.out.println("a= " + this.a + "b= "+ this.b);
	}
	public void setA(int x) { this.a = x;}
	public void setB(int y) { this.b = y;}

	public final void disp(int x)
	{
		System.out.println("x= " + x);
	}
}

class B extends A
{
	
	public void disp(int x)
	{
		x= x*x;
		System.out.println("x= " + x);
	}
	public void disp()
	{
		System.out.println("Hello Shikhar");
	}
}


class Test
{
	public static void main(String args[])
	{
		//final A a1 = new A(10,40);
		//a1.setA(-1000);
		//a1.setB(-5000);
		//a1 = new A(20,30);
		//a1 = new A(-5,-6);
		//a1.display();
		//a1.display();

		B b1 = new B();
		b1.disp();
		b1.disp(10);

				

	}
}
		