import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int y=n/365;
        int w=(n%365)/7;
        System.out.println(y);
        System.out.println(w);
    }
}