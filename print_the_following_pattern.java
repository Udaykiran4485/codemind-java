import java.util.*;
 class Pattern
{

	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		for(i=1;i<=n;i++)			
		{   
			for( j=1;j<=n;j++)		
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}
}