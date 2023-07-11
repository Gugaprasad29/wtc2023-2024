public class a 
{
    int i=5;
    public class b
    {
        void play()
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        a.o=new a();
        a.b.p=new b();
        p.play();
    }
}