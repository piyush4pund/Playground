import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int exp = sc.nextInt();
        int c = 0,r = 1;
        while(c < exp)
        {
            r = r * b;
            c++;
        }
        System.out.println(r);
    }
}