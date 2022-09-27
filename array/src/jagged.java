import java.util.Scanner;
public class jagged {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int [2][];
		a [0]=new int[0];
		a[0]=new int [1];
		a[1]=new int [0];
		a[1]=new int [1];
		a[1]=new int [2];
		for( int i=0;i<a.length;i++)
		{
			for ( int j=0; j<a[i].length;j++)
			{
				System.out.println("enter the age of school"+i+ "student" +j);
				a[i][j]=scan.nextInt();
				
			}
			System.out.println("the ages are");
			for( int i=0;i<a.length; i++)
			{
				for ( int j=0; j<a[i].length;j++)
				{
					System.out.println(a[i][j]);
				}
			}
		}
	}

}
