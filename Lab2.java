class Lab2
{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean b1;
	
	void show1()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b1);
	}
	
	void show2()
	{
		int a=12;
		int b=10;
		int c=0x12a;
		Byte d=012;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
	
public static void main(String [] args)
{
	Lab2 h=new Lab2();
	h.show1();
	h.show2();
}		
}