class Friends
{
public Friends(String name)
{
System.out.println("In Friends is: "+name);
}
}
public class Riya extends Friends
{
public Riya()
{
super("Sahyadri");
System.out.println("in Riyas constructor..");
}
public static void main(String args[])
{
Riya r=new Riya();
}
}

