public  class adodev
{
    public static void main(String args[])
    {
        int num1;int num2;int num;
        System.out.println("Enter the number1:  ");
        Scanner n1=new Scanner(System.in);
        num1=n1.nextInt();
        
        System.out.println("Enter the number2:  ");
        Scanner n2=new Scanner(System.in);
        num2=n2.nextInt();
        num=num1+num2;

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