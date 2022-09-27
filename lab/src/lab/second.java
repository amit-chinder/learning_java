package lab;
//input output
class second{
int a=10;
int b=15;
int add(int a,int b)
{
	
int c=a+b;
return c;
}

	public static void main(String[] args)
	{
	second sec = new second();
	 int t=sec.add(10,15);
	 System.out.println(t);
}
}