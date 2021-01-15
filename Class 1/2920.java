package BaekJoon;

import java.io.*;
import java.lang.*;
import java.util.*;

class H {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n[] = new int[8];

        for(int i=0; i < n.length; i++)
        {
            n[i] = scanner.nextInt();
        }

        String answer = "";
        for(int i=0; i < n.length-1; i++)
        {
            if(n[i] == n[i+1]-1)
            {
                answer = "ascending";
            }
            else if(n[i] == n[i+1]+1)
            {
                answer = "descending";
            }
            else
            {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }

    
}
