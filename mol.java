public class mol
{
    public void add(int a)
    {
        System.out.println(a+5);
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        mol o=new mol();
        o.add(3);
        o.add(3,5);
        o.add(3,5,7);
    }
}