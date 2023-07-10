public class rectangle
{
    public static void main(String args[])
    {
        int l=5,b=3;
        rectangle o=new rectangle();
        o.area(l,b);
    }
    public void area(int l,int b)
    {
        
        int c=l*b;
        System.out.println(c);
    }
}