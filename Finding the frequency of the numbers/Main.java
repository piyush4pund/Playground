import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            a[idx] = in.nextInt();
        }
        int f[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            f[i] = 0;
        }
        for(int idx = 0; idx <= n - 1; idx++){
           f[a[idx] - 1]++;
        }
        for(int idx = 0; idx <= k - 1; idx++){
           System.out.println((idx + 1) + " " + f[idx]);
        }
    }
}