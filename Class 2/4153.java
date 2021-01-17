import java.io.*;
import java.lang.*;
import java.util.*;

class B {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        while(true)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
    
            if(a == 0 && b == 0 && c == 0)
            {
                break;
            }

            if((a*a + b*b) == c*c)
            {
                System.out.println("right");
            }
            else if((a*a + c*c) == b*b)
            {
                System.out.println("right");
            }
            else if((b*b + c*c) == a*a)
            {
                System.out.println("right");
            }
            else
            {
                System.out.println("wrong");
            }
        }
    }
}