public  class odev
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the number:  ");
        Scanner o=new Scanner(System.in);
        num=o.nextInt();

        if(num%2==0)
        {
            System.out.println(num+" is even");
        }
        else if(num==0)
        {
            System.out.println("Given number is zero");
        }
        else
        {
            System.out.println(num+" is odd");
        }
        
    }
}