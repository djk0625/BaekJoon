package BaekJoon;

import java.io.*;
import java.lang.*;
import java.util.*;

class G {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int data[] = new int[5];
        int answer = 0;

        for(int i=0; i < 5; i++)
        {
            data[i] = scanner.nextInt();
            answer += (data[i] * data[i]);
        }   

        int temp = answer % 10;
        System.out.println(temp);

    }
    
}
