import java.io.*;
import java.lang.*;
import java.util.*;

class E {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        String a = scanner.next();
        String b = scanner.next();

        String temp = "";
        for(int i = a.length()-1; i >=0; i--)
        {
            temp += a.charAt(i);
        }

        String temp2 = "";
        for(int i = b.length()-1; i >= 0; i--)
        {
            temp2 += b.charAt(i);
        }

        int answer1 = Integer.parseInt(temp);
        int answer2 = Integer.parseInt(temp2);

        if(answer1 > answer2)
        {
            System.out.println(answer1);
        }
        else
        {
            System.out.println(answer2);
        }
    }
}