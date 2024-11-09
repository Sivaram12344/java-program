import java.util.Scanner;
class Circle1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int radius;
float Area;
float phi;
System.out.println("enter the radius:");
radius=s.nextInt();
System.out.println("enter the phi:");
phi=s.nextFloat();
Area=phi*radius*radius;
System.out.println("the area of the circle:"+Area);
}
}