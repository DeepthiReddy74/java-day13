import java.util.*;
class a//parrent class
{
    public void pl()
    {
        System.out.println("hello students");

    }
}
class b extends a//sub class
{
    public void r()
    {
        System.out.println("hello teachers");

    }
}
public class singleinheritance
{
    public static void main(String args[])
    {
        a h=new a();
         h.pl(); 
        b y=new b();
        y.r();

    }
}