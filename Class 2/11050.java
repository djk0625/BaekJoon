import java.io.*;
import java.lang.*;
import java.util.*;

class F {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(Factorial(n) / (Factorial(k) * Factorial(n-k)));
    }

    public static int Factorial(int t)
    {
        int i = 1;
        for(int j = 1; j <= t; j++)
        {
            i *= j;
        }
        return i;
    }
    
}
