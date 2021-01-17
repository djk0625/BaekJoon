import java.io.*;
import java.lang.*;
import java.util.*;

class K {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            int a = scanner.nextInt();
            String word = scanner.next();

            for(int j = 0; j < word.length(); j++)
            {
                for(int m = 0; m < a; m++)
                {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
    
}
