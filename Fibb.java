import java.util.Scanner;
class Fibb
{
public static void main(String[] args)
{
int n,a=0,b=0,c=1;
Scanner S=new Scanner(System.in);
System.out.println("enter a number");
n = S.nextInt();
System.out.println("fibnociss series");
for(int i=1;i<=n;i++)
 {
    a=b;
    b=c;
    c=a+b;
    System.out.print(a+" ");
}
}
}
