import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n,c=0,x;
        n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x=sc.nextInt();
        for(int i=0;i<n;i++)
        if(a[i]==x)
        {
            c++;
        }
        System.out.println(c);
    }
}