import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int n=in.nextInt();
      int ld,fd,s=0;
      ld=n%10;
      fd=n;
      while(n>=10)
      {
        n=n/10;
      }
      
      fd=n;
      s=fd+ld;
      System.out.println(s);
      
	}
}