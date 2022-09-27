class noinputyesoutput{
int a=40;
int b=50;
int add(){
int c=a+b;
return c;
}
public static void main(String []args) {
	noinputyesoutput a=new noinputyesoutput();
	int t=a.add();
	System.out.println(t);
}	
}