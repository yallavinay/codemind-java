import java.util.*;
public class sapmle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int sp,cp;
        cp=sc.nextInt();
        sp=sc.nextInt();
        if (sp>cp)
        {
            System.out.println("Profit");
        }
        else if(sp<cp)
        {
            System.out.println("Loss");
        }
        else
        {
            System.out.println("No profit and No loss");
        }
    }
}