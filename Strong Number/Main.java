import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=0,temp,fact=1,sum=0;
      temp=n;
      while(temp>0){
      fact=1;
       int i=1;
        a=temp%10;
        while(i<=a){
          fact=fact*i;
          i++;
         }
       sum=sum+fact;
        temp=temp/10;
      }
      if(n==sum){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
	}
}