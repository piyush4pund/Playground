import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int i;
      int s=0;
      for(i=1;i<=n;i++)
      {
        s=s+i;
      }
      System.out.println(s);
	}
}