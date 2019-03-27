import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<=n-1;i++)
      list[i]=in.nextInt();
    l(list,n);
  }
  public static void l(int list[],int n)
  {
    int max=list[0];
    int idx=0;
    for(int i=0;i<=n-1;i++)
    {
      if (max < list[i]) 
			{
				max = list[i];
				idx = i;
			}
    }
    System.out.println(idx);
  }
}