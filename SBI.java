class RBI
{
public int roi()
{
return 7;
}
}
public class SBI extends RBI
{
public int roi()
{
return 8;
}
public static void main(String args[])
{
SBI o=new SBI();
System.out.println("ROI is: "+o.roi());
}
}