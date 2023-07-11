public class length
{
    int l=5;
}
public class breadth extends length
{
    int b=3;
}
public class area extends breadth
{
    public static void main(String args[])
    {
        area o=new area();
        int a=o.l*o.b;
        System.out.println(a);
    }
}