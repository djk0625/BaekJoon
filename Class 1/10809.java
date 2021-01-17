import java.io.*;
import java.lang.*;
import java.util.*;

class L {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = scanner.nextLine();
        for (char c = 'a'; c <= 'z'; c++)
        {
            System.out.print(s.indexOf(c) + " ");
        }
    }
    
}
