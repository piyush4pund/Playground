import java.util.Scanner;
class Main{
  public static int pow(int num1, int num2)
  {
    int result=1;
    while (num2 != 0)
    {
        result *= num1;
        --num2;
    }
    return result;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
    int op=pow(n1,n2);
    System.out.println(op);
  }
}


            