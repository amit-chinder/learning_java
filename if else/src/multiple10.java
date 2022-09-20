import java.util.Scanner;
public class multiple10 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int d = scan.nextInt();
		if(d%10==0)
		{
			System.out.println("multilple of 10");
		}
		else
		{
			System.out.println("not multiple of 10");
		}

	}

}
