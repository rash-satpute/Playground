import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int sum=0;
      while(n>0){
      int a=n%10;
        n=n/10;
       sum=sum+(a*a*a);
        
      }
      if(sum==temp){
      System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
	}
}