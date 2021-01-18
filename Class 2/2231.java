import java.io.*;
import java.lang.*;
import java.util.*;

class C {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int N = scanner.nextInt();
        int size = String.valueOf(N).length();
        int first = N - (9*size);
        int sum = 0;

        for(int i = first; i < N; i++)
        {
            int answer = i;
            int k = i;
            while(k > 0)
            {
                answer += k%10;
                k /= 10;
            }

            if(answer == N)
            {
                sum = i;
                break;
            }
        }
        System.out.println(sum);
    }
}