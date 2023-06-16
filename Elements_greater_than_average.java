import java.util.*;
public class smaller
{
    public static void main(String args[])
    {
        int n,sum=0,avg,c=0;
        Scanner sc= new Scanner (System.in);
        n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum= sum+arr[i];
        }
        avg= sum/n;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>=avg)
                c++;
        System.out.println(c);
    }
}