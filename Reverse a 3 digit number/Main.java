import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int a=num/100;
    int b=(num/10)%10;
    int c=num%10;
    int sum=c*100+b*10+a;
    System.out.println(sum);
  }
}