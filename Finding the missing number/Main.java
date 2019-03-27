  import java.util.*; 
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            arr[i] = in.nextInt();
        }
        int v = 0;
       for(int val = 1; val <= n; val++)
        {
            boolean found = false;
            for(int indx = 0; indx <= n - 1; indx++){
                if(arr[indx] == val)
                {
                    found = true;
                    break;
                }
            }
            if(found == false){
                v = val;
                break;
            }
        }
        System.out.print(v);
    }
}