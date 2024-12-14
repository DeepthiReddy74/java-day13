class trycatch
{
    public static void main(String args[])
    {
        //try-catch
        try
        {
            int d=10/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("bad request");
        }
    }
}