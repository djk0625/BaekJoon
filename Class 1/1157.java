package BaekJoon;

import java.io.*;
import java.lang.*;
import java.util.*;

class J {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String word = scanner.nextLine().toUpperCase();

        int arr[] = new int[26];
        int max = 0;
        char result = '?';
        
        for(int i=0; i < word.length(); i++)
        {
            arr[word.charAt(i)-'A']++;  // index를 첫 원소부터 시작하여, 단어가 나올때마다 증가
            if(max < arr[word.charAt(i)-'A'])
            {
                max = arr[word.charAt(i)-'A'];
                result = word.charAt(i);
            }
            else if(max == arr[word.charAt(i)-'A'])
            {
                result = '?';
            }
        }
        System.out.println(result);
    }
    
}
