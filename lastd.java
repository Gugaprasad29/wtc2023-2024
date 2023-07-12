public class lastd
{
    public static void main(String args[])
    {
        lastd o=new lastd();
        int a=o.cal();
        System.out.println("Last didgit is "+ a);
    }
    public int cal()
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextLine();
        return Math.abs(n%10);
    }
}