import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gcd(n1,n2,n3));
	}
  public static int gcd(int n1,int n2,int n3){
  int min_element,ged=0;
    if(n1>n2 && n1>n3){
    min_element=n1;
    }
    else if(n2>n3 && n2>n1){
    min_element=n2;
    }
    else {
    min_element=n3;
    }
    while(min_element>=1){
    if((n1%min_element==0) &&(n2%min_element==0)){
    ged=min_element;
      break;
    }
      min_element--;
    }
    return ged;
  }
}