class Flower
{
String colour="Pink";
}
public class Rose extends Flower
{
String colour="Red";
{
System.out.println("The colour is: "+super.colour);
System.out.println("The colour is: "+colour);
}
public static void main(String args[])
{
Rose r=new Rose();
}
}
