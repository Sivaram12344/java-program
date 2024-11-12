public class StringExample
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
StringBuffer sb1=new StringBuffer("WELCOME");
System.out.println("The default capacity of StringBuffer does is:" + sb.capacity());
System.out.println("The length of given StringBuffer is: " + sb1.length());
System.out.println("The reverse of given StringBuffer is: " + sb1.reverse());
}
}

