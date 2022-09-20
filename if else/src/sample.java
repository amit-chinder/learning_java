import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your age ");
		int age=scan.nextInt();
		System.out.println(age);
		if(age>=18)
		{
			System.out.println("WELLCOME TO ***");
		}
		else
		{
			System.out.println("WELLCOME NEXT YEAR");
		}
	}

}
