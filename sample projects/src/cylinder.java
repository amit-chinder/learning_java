import java.util.Scanner;
public class cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int r= scan.nextInt();
		int h= scan.nextInt();
		float c=2*3.142f*r*(r+h);
		//double c=2*3.142*r*(r+h);
		System.out.println(c);
		

	}

}
