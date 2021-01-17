import java.io.*;
import java.lang.*;
import java.util.*;

class A {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int a = Math.min(x, w-x);
        int b = Math.min(y, h-y);

        System.out.print(Math.min(a, b));
    }
}
