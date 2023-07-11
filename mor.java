public class mor
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
        mor o=new mor();
        o.add(3,5.3);
        o.add(3,5000989);
        o.add(3,5);
    }
}