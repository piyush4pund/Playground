import java.util.Scanner;
class Main
{
  public static int sq(int num)
  {
    int op=num*num;
    return op;
  }
    public static void main (String[] args)
    {
	 // Type your code here   
	
  Scanner in= new Scanner(System.in);
  int n=in.nextInt();
  int sqr=sq(n);
  System.out.println(sqr);
}
}