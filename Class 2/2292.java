import java.io.*;
import java.lang.*;
import java.util.*;

class D {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        
        int k = 1;
        int a = 2;

        if(n == 1)
        {
            System.out.print(1);
        }

        else
        {
            while(a <= n)
            {
                a = a + (6 * k);
                k++;
            }
            System.out.print(k);
        }
    }
    
}
