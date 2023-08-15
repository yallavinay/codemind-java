import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h= n/60;
        int m=n%60;
        System.out.println(h+" Hour(s) "+m+" Minute(s)");
    }
}