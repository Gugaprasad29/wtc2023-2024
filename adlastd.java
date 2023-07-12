public class adlastd
{
    public static void main(String args[])
    {
        System.out.println(addld(267,154));
    }
    public static int addld(int n1,int n2)
    {
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        int num1=n1%10;
        int num2=n2%10;
        return num1+num2;
    }
}