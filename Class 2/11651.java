import java.io.*;
import java.lang.*;
import java.util.*;

class K2 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int data[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = scanner.nextInt();
            data[i][1] = scanner.nextInt();
        }

        Arrays.sort(data, (a1, a2) -> {
            if (a1[1] == a2[1])
            {
                return a1[0] - a2[0];
            }
            else
            {
                return a1[1] - a2[1];
            }
        });

        for(int i = 0; i < n; i++)
        {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }
}