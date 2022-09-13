import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n*(n-1)/2;
        System.out.println(temp);
    }
}