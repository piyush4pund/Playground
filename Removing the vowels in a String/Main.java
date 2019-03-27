    import java.util.Scanner;
     class Main
    {    
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            
            String s = sc.nextLine();
            
            String r = s.replaceAll("[AEIOUaeiou]", "");
            
        	 System.out.println(r);
            
            sc.close();
        }
    }