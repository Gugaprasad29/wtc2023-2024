import java.util.Scanner;
public class isev
{
    public static void main(String args[])
    {
        isev i=new isev();
        int j=i.cal();
        System.out.println(j);
    }
    public int cal()
    {
        int n;
        System.out.println("Enter the number: ");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        if((n%2==0)||(n==0))
        {
            return 2;
        }
        else
            return 1;
    }
}