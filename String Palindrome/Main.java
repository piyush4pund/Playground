import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      int l=s.length();
      int e=l-1;
      int f=0;
      boolean pali=true;
      while(f<e)
      {
        if(s.charAt(f)!=s.charAt(e))
        {
      	 pali=false;
          break;
        }
        f++;
        e--;
      }
      if(pali==true)
            System.out.println("Yes");
         else
        System.out.println("No");
          } 
}