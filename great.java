import java.util.Scanner;
public class great
{
    public static void main(String args[])
    {
        int num1,num2;
        System.out.println("Enter the number 1: ");
        System.out.println("Enter the number 2: ");
        Scanner n1=new Scanner(System.in);
        Scanner n2=new Scanner(System.in);
        num1=n1.nextInt();
        num2=n2.nextInt();
        if(num1>num2)
        {
            System.out.println(num1+"is greater");
        }
        else if(num2>num1)
        {
            System.out.println(num2+"is greater");
        }
        else
        {
            System.out.println("Two numbers are equal");
        }
    }
}