package lab;

class callbyrefer
{
int a=10;
int b=20;

public static void main(String []args) 
{
	callbyrefer v = new callbyrefer();
	
	System.out.println(v.a);
	System.out.println(v.b);
}
}