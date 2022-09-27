package array;
import java.util.Scanner;
public class twoD {
	
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int[][]a = new int[2][3];
	for (int i=0; i<2; i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println("enter the age" +i+ "student" +j);
			 a[i][j]= scan.nextInt();
		}
	for (int i=0; i<2; i++)
	{
		for(int j=0; j<3; j++)
		{
			System.out.println(a[i][j]);
		}
			
}
}
}
}
