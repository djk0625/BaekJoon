import java.io.*;
import java.lang.*;
import java.util.*;

class D {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        String a = scanner.next();
        int answer = 0;

        for(int i = 0; i < n; i++)
        {
            int sum = a.charAt(i);
            answer += sum - 48;
        }
        System.out.println(answer);
    }
}