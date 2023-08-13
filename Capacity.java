import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int c=2*t*s*b*512;
        int k = c/1024;
        System.out.println(k+" KB");
    }
}