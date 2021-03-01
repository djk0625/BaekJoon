import java.io.*;
import java.lang.*;
import java.util.*;

class H2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int N = scanner.nextInt();

        int num = 666;
        int count = 1;

        while(count != N)
        {
            num++;
            if(String.valueOf(num).contains("666"))
            {
                count++;
            }
        }
        System.out.println(num);
    }
}
