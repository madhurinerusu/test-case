ion Of Two Numbers Java ProgramJava
import java.util.Scanner;
class Div
{
public static void main(String[] arg)
{
int n,d,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter numerator value");
n=sc.nextInt();
System.out.println("Enter denominator value");
d=sc.nextInt();
if(d!=0)
{
res=n/d;
System.out.println("Division of two numbers is : "+res);
}
else
System.out.println("denominator value should not be 0");
}
}
