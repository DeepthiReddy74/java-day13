class trycatchfinally
{
    public static void main(String args[])
    {
        try{
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("catch block is runing");
        }
        finally
        {
            System.out.println("finally is runing");
            
        }
    }
}