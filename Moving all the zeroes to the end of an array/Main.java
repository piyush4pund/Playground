import java.util.Scanner;
class Main{
  public static void parti(int n,int arr[])
  {
    int pos[]=new int[n];
    int pos_size=0;
    int z[]=new int[n];
    int z_size=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>0)
      {
        pos[pos_size]=arr[i];
        pos_size++;
      }
      else
      {
        z[z_size]=arr[i];
        z_size++;
      }
    }
    int ai=0;
    for(int i=0;i<=(pos_size-1);i++)
    {
      arr[ai]=pos[i];
      ai++;
    }
     for(int i=0;i<=(z_size-1);i++)
    {
      arr[ai]=z[i];
      ai++;
    }
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=(n-1);i++)
        arr[i]=in.nextInt();
      parti(n,arr);
      for(int i=0;i<=n-1;i++)
        System.out.print(arr[i]+" ");
    }
}