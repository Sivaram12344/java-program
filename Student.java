import java.util.Scanner;
public class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno,sub1,sub2,sub3,total;
String sname;
float savg;
System.out.println("Enter Student number:");
sno=sc.nextInt();
System.out.println("Enter Student name:");
sname=sc.next();
System.out.println("Enter marks for physics:");
sub1=sc.nextInt();
System.out.println("Enter marks for chemistry:");
sub2=sc.nextInt();
System.out.println("Enter marks for maths:");
sub3=sc.nextInt();
total=sub1+sub2+sub3;
savg=total/3;
System.out.println("\nStudent report: ");
System.out.println("Student number:"+sno);
System.out.println("Student name:"+sname);
System.out.println("Total marks:"+total);
System.out.println("average marks:"+savg);
sc.close();
}
}
