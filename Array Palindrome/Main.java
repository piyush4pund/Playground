import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
        a[i]=in.nextInt();
      int l=0;
      int r=n-1;
      boolean pali=true;
      while(l<=r)
      {
        if(a[l]!=a[r])
        {
          pali=false;
          break;
        }
        l++;
        r--;
      }
        if(pali == true){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
      
    }
}