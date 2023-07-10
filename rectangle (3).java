public class rectangle
{
    public static void main(String args[])
    {
        int l=5,b=3;
        rectangle o=new rectangle();
        int r=o.area(l,b);
        System.out.println(r);
    }
    public int area(int l, int b)
    {
        
        int c=l*b;
        return c;
    }
}