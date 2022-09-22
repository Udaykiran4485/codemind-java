import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,count=0,avg;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]<=avg)
            count++;
        }
        System.out.println(count);
    }
}