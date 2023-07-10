public class rectangle
{
    public static void main(String args[])
    {
        
        rectangle o=new rectangle();
        int r=o.area();
        System.out.println(r);
    }
    public int area()
    {
        int l=5,b=3;
        int c=l*b;
        return c;
    }
}