public class area
{
    int l=5;
}
public class rect extends area
{
    int b=3;
    public static void main(String args[])
    {
        rect o=new rect();
        System.out.println(o.l*o.b);
    }
}