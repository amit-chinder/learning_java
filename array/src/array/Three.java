package array;
import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		int[][][]a=new int[2][3][4];
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		//a[2][3][4]=scan.nextInt();
		
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					for(k=0;k<4;k++)
					{
						System.out.println("Enter the ages ");
						a[i][j][k]=scan.nextInt();
					}
					System.out.println("the ages are");
					for(i=0;i<2;i++)
					{
						for(j=0;j<3;j++)
						{
							for(k=0;k<4;k++)
							{
								System.out.println(a[i][j][k]);
							}
						}
					}
				}
			}
	}
}


