public class mol2
{
    public void add(int a,float b)
    {
        System.out.println(a+b);
    }
    public void add(int a,double b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        mol2 o=new mol2();
        o.add(3,5.3);
        o.add(3,5000989);
        o.add(3,5);
    }
}