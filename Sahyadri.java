class Bhausaheb
{
public void display()
{
System.out.println("Class parent....");
}
}
public class Sahyadri extends Bhausaheb
{
public void display()
{
super.display();
System.out.println("Class children...");
}
public static void main(String args[])
{
Sahyadri s=new Sahyadri();
s.display();
}
}
