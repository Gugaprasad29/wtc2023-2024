import java.util.Scanner;
public class isod
{
    public static void main(String args[])
    {
        isod i=new isod();
        int j=i.cal();
        System.out.println(j);
    }
    public int cal()
    {
        int n;
        System.out.println("Enter the number: ");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        if((n%2!=0)&&(n!=0))
        {
            return 2;
        }
        else
            return 1;
    }
}