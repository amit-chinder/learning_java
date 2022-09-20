import java.util.Scanner;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int f= scan.nextInt();
		float c=(f-32.0f*5)/9;
		System.out.println(c);

	}

}
