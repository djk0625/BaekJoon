import java.io.*;
import java.lang.*;
import java.util.*;

class E {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int T = scanner.nextInt();

        for(int i = 0; i < T; i++)
        {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(Sum(k, n));
        }
    }

    public static int Sum(int k, int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(k == 0)
        {
            return n;
        }
        else
        {
            return Sum(k, n-1) + Sum(k-1, n);
        }
    }
}