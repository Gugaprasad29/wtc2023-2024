interface one
{
    void play();
}
public class two implements one
{
    public void play()
    {
        System.out.println(10*8);
    }
}
public class three implements two
{
    public void play()
    {
        System.out.println(8*8);
    }
    public static void main(String args[])
    {
        three o=new three();
        o.play();
    }
}