import java.util.Scanner;
public class lastsecd
{
    public static void main(String args[])
    {
        lastsecd o=new lastsecd();
        int a=o.cal();
        System.out.println("Last didgit is "+ a);
    }
    public int cal()
    {
        System.out.println("Enter the number: ");
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int i=Math.abs(n);
        if(i/10==0)
            return -1;
        return(i%100)/10;
    }
}