import java.util.Scanner;
class Sample
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int arr[],n,i,k;
	  n=sc.nextInt();
	  arr=new int[n];
	  for(i=0;i<n;i++)
	     arr[i]=sc.nextInt();
	  for(i=0;i<n;i++)
	  {
	      if(arr[i]%2!=0)
	      {
	          System.out.println("False");
	          System.exit(0);
	      }
	      
	  }
	  System.out.println("True");
   }
}
	  
