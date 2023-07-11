import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        if(num>0)
        {
            System.out.println(num+"is positive");
        }
        else if(num==0)
        {
            System.out.println(num+"is zero");
        }
        else
        {
            System.out.println(num+"is negative");
        }
    }
}