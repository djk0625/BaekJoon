package BaekJoon;

import java.io.*;
import java.lang.*;
import java.util.*;

class I {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String data = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(data, " ");
        
        System.out.println(stringTokenizer.countTokens());

    }
    
}
