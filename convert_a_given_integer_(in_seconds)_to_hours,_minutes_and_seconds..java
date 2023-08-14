import java.util.*;
public class sample {
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int h=(n/3600);
        int m=(n-(3600*h))/60;
        int s= (n-(3600*h)-(m*60));
        System.out.println("H:M:S-"+h+":"+m+":"+s);
    }
}